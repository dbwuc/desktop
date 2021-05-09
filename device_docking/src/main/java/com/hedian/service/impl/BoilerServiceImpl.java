package com.hedian.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hedian.base.Ids;
import com.hedian.entity.Boiler;
import com.hedian.mapper.BoilerMapper;
import com.hedian.service.BoilerService;
import com.hedian.utils.DateUtils;
import com.hedian.utils.ListUtils;
import com.hedian.utils.SoapServiceUtil;
import com.hedian.utils.XmlToJson;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.*;

import static java.util.stream.Collectors.toList;

/**
 * <p>
 * 特种设备锅炉基础信息表 服务实现类
 * </p>
 *
 * @author HC
 * @since 2021-02-07
 */
@Service
@Slf4j
public class BoilerServiceImpl extends ServiceImpl<BoilerMapper, Boiler> implements BoilerService {

    /**
     * body 标签下的标签
     */
    String tag1 = null;
    /**
     * tag1 标签下的标签
     */
    String tag2 = null;
    /**
     * 下标增减数字 1
     */
    Integer param1 = null;
    /**
     * 下标增减数字 2
     */
    Integer param2 = null;

    public static final String NEW_ADD_BOILERS = "1";

    @Autowired
    private BoilerMapper boilerMapper;


    /**
     * 更新同步锅炉基础信息
     *  @param webUrl
     * @param serviceAppId
     * @param serviceModule
     * @return
     */
    @Override
    public Map<String, List<Boiler>>    boilerService(String webUrl, String serviceAppId, String serviceModule) throws Exception {

        // xml 数据
        String res = SoapServiceUtil.SendSoap(webUrl, serviceAppId, serviceModule);
        if (StringUtils.isEmpty(res)) {
            Map<String, List<Boiler>> resMap = new HashMap<>();
            List<Boiler> strings = new ArrayList<>();
            resMap.put("返回的 xml 数据为空，故不进行下一步操作-- res ------>:", strings);
            return resMap;
        }
        // 处理 xml格式数据,并添加进 list
        List<Boiler> boilerList = new ArrayList<>();
        List<Element> tag2List = XmlToJson.dom4jXmlList(res, tag1, tag2);
        tag2List.forEach(t2 -> {
            try {
                // 对接的锅炉数据 boilerList
                boilerList.add(getTagJson(t2));
            } catch (ParseException parseException) {
                parseException.printStackTrace();
            }
        });

        if (CollectionUtils.isEmpty(boilerList)) {
            Map<String, List<Boiler>> stringListMap = new HashMap<>();
            stringListMap.put("返回的 xml文本中锅炉数据为空，故不执行下一步操作--- boilerList ------>:", boilerList);
            return stringListMap;
        }

        //过滤对接锅炉数据：未删除的数据（use_flag = 1）
        List<Boiler> boilerStream = boilerList.stream()
                .filter(boiler -> boiler.getUseFlag().equals(1))
                .collect(toList());

        //查询本地数据库已经记录数据:boilerDB
        LambdaQueryWrapper<Boiler> lambdaBoiler = new LambdaQueryWrapper<>();
        List<Boiler> boilerDB = boilerMapper.selectList(lambdaBoiler);
        log.info("查询数据库锅炉基本信息--- boilerDB ---");

        // 筛选出 use_flag = 1 的本地锅炉基本数据：boilerStream1；
        List<Boiler> boilerStream1 = boilerDB.stream()
                .filter(boiler -> boiler.getUseFlag().equals(1))
                .collect(toList());

        Map<String, List<Boiler>> map = ListUtils.getMap(boilerStream, boilerStream1);

        //刪除旧锅炉信息
        List<Boiler> removeBoilers = map.get(ListUtils.LIST2_REMOVE_LIST1);
        if (!CollectionUtils.isEmpty(removeBoilers)) {
            List<String> removeIdList = removeBoilers.stream()
                    .map(Boiler::getId).collect(toList());
            boilerMapper.deleteBatchIds(removeIdList);
            log.info("删除过期锅炉信息完毕");
        }


        // 更新锅炉信息, 比对两个数据的修改时间是否一致，不一致则更新；
        List<String> streamIds = boilerStream1.stream()
                .flatMap(a -> boilerStream.stream()
                        .filter(b -> !b.getModifiedTime().equals(a.getModifiedTime()))
                        .map(Boiler::getId)
                        .distinct()
                )
                .collect(toList());

        Ids list = Ids.builder()
                .boilerStream(boilerStream)
                .streamIds(streamIds)
                .build();
        boilerMapper.updateBoilersByTimeAndId(list);

        //新增锅炉信息
        Map<String, List<Boiler>> boilerMap = new HashMap<>();
        List<Boiler> newAddBoilers = map.get(ListUtils.LIST1_REMOVE_LIST2);
        boilerMap.put(NEW_ADD_BOILERS,newAddBoilers);

        return boilerMap;
    }

    private Boiler getTagJson(Element t2) throws ParseException {
        Boiler boiler = Boiler.builder()
                .id(t2.elementText(""))
                .departmentId("a20882032f91bb6383e46242756d4d36")
                .dwnbbh(t2.elementText(""))
                .glmc(t2.elementText(""))
                .glxh(t2.elementText(""))
                .glflx(t2.elementText(""))
                .glzl(t2.elementText(""))
                .glpz(t2.elementText(""))
                .glyt(t2.elementText(""))
                .szdd(t2.elementText(""))
                .lxdh(t2.elementText(""))
                .ccbh(t2.elementText(""))
                .sbzt(t2.elementText(""))
                .syzt(t2.elementText(""))
                .tyrq(DateUtils.stringToDate(t2.elementText("")))
                .zczt(t2.elementText(""))
                .yzcdm(t2.elementText(""))
                .zgbmmc(t2.elementText(""))
                .zgbmbh(t2.elementText(""))
                .zcyz(new BigDecimal(t2.elementText("")))
                .zcjz(new BigDecimal(t2.elementText("")))
                .sfdzgl(t2.elementText(""))
                .delFlag(Integer.valueOf(t2.elementText("")))
                .useFlag(Integer.valueOf(t2.elementText("")))
                .createId(t2.elementText(""))
                .createTime(DateUtils.stringToDate(t2.elementText("")))
                .modifiedId(t2.elementText(""))
                .modifiedTime(DateUtils.stringToDate(t2.elementText("")))
                .build();
        return boiler;
    }
}
