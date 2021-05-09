package com.hedian.controller;

import com.hedian.base.BaseResult;
import com.hedian.entity.Boiler;
import com.hedian.service.BoilerService;
import com.hedian.service.impl.BoilerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
 * @Desc: 特种设备 前端控制器
 * @Author: HC
 * @Since: 2021/2/18
 */
@RestController
@RequestMapping
public class DeviceController {

    @Autowired
    private BoilerService boilerService;

    @Autowired
    private BoilerServiceImpl boilerServiceImpl;

    @Value("${webUrl}")
    private String webUrl;

    @Value("${Serviceappid}")
    private String serviceAppId;

    @Value("${Servicemodule}")
    private String serviceModule;

    /**
     *锅炉基础信息更新同步
     */
    public BaseResult boiler() throws Exception {
        Map<String, List<Boiler>> newAddBoilers = boilerService.boilerService(webUrl, serviceAppId, serviceModule);
        if (CollectionUtils.isEmpty(newAddBoilers)) {
            return new BaseResult<>("数据为空------>workerDataArray{}" + newAddBoilers);
        }
        List<Boiler> boilers = newAddBoilers.get(BoilerServiceImpl.NEW_ADD_BOILERS);
        boilerServiceImpl.saveBatch(boilers,10000);
        return new BaseResult<>();
    }
}
