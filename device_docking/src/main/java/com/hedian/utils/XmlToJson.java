package com.hedian.utils;

import jdk.nashorn.internal.runtime.logging.DebugLogger;
import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.springframework.util.CollectionUtils;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Desc: xml 解析为 json
 * @Author: HC
 * @Since: 2021/2/23
 */
public class XmlToJson {

    private static DebugLogger logger;
    /**
     *获取两个指定标签之间的数据
     * @param xmlStr
     * @param tag1
     * @param tag2
     * @param param1
     * @param param2
     * @return
     * @throws Exception
     */
    public static String dom4jXml(String xmlStr, String tag1, String tag2, Integer param1, Integer param2) throws Exception {
        int indexbegin = xmlStr.indexOf(tag1);
        int indexend = xmlStr.indexOf(tag2);
        // 截取指定index之间的数据
        String jsonStr = xmlStr.substring(indexbegin + param1, indexend - param2);
        return jsonStr;
    }


    /**1
     *
     * 获取指定标签下的所有子标签的值
     * @param xmlStr
     * @return
     * @throws Exception
     */
    public static List<Element> dom4jXmlList(String xmlStr, String tag1, String tag2) throws Exception{
        List<Element> elementList = null;
        try {
            SAXReader sr = new SAXReader();
            sr.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            Document document = sr.read(new ByteArrayInputStream(xmlStr.getBytes()));

            Element root = document.getRootElement();
            elementList = root.elements();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        if (CollectionUtils.isEmpty(elementList)) {
            logger.info("返回 集合 数据为空----->:" + elementList);
        }
        ArrayList<Element> list1 = new ArrayList<>();
        elementList.forEach(e ->{
            //解析标签下一级标签
            Element e1 = e.element(tag1);
            Element e2 = e1.element(tag2);
            List<Element> tag2List = e2.elements();
            list1.addAll(tag2List);
        });
        return list1;
    }
}
