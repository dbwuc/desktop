//package com.hedian.device_docking;
//
//import com.alibaba.fastjson.parser.DefaultJSONParser;
//import com.hedian.utils.*;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.alibaba.fastjson.JSONReader;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//
///**
// * @Desc:
// * @Author: HC
// * @Since: 2021/2/22
// */
//@SpringBootTest
//public class Test1 {
//
//    @Autowired
//    private XmlToJson xmlToJson;
//
//    @Test
//    public void test() throws Exception {
//
//        String res = "<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">" +
//                "<soap:Body><CheckTokenResponse xmlns=\"http://tempuri.org/\">" +
//                "<CheckTokenResult>" +
//                "<string>阿斯蒂芬</string>" +
//                "<test>asdf</test>" +
//                "<content>返回成功</content>" +
//                "</CheckTokenResult>" +
//                "</CheckTokenResponse></soap:Body></soap:Envelope>";
//
//        String xmlStr = "<soap-env:Envelope xmlns:soap-env=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
//                "   <soap-env:Header/>\n" +
//                "   <soap-env:Body>\n" +
//                "      <n0:ZFM_PIWS_0000Response xmlns:n0=\"urn:sap-com:document:sap:rfc:functions\">\n" +
//                "         <STRRESP>" +
//                "{\"IsSuccess\":true,\"Data\":\"测试\",\"Message\":\"调用成功\",\"ServiceRequest\":{{\"Busid\":\"?\",\"Appid\":\"?\",\"Appname\":\"?\",\"Ip\":\"?\",\"Userid\":\"?\",\"Version\":\"?\",\"Isencryption\":\"?\",\"Encryptiontype\":\"?\",\"Iscompression\":\"?\",\"Compressiontype\":\"?\",\"Mainstring\":\"?\",\"Mainformart\":\"?\",\"Remark\":\"?\",\"Serviceappid\":\"PSSCT0\",\"Serviceappname\":\"?\",\"Serviceusername\":\"?\",\"Servicepassword\":\"?\",\"Servicemodule\":\"000_000_0000\",\"Servicemodulename\":\"?\"},{\"Busid\":\"?\",\"Appid\":\"?\",\"Appname\":\"?\",\"Ip\":\"?\",\"Userid\":\"?\",\"Version\":\"?\",\"Isencryption\":\"?\",\"Encryptiontype\":\"?\",\"Iscompression\":\"?\",\"Compressiontype\":\"?\",\"Mainstring\":\"?\",\"Mainformart\":\"?\",\"Remark\":\"?\",\"Serviceappid\":\"PSSCT0\",\"Serviceappname\":\"?\",\"Serviceusername\":\"?\",\"Servicepassword\":\"?\",\"Servicemodule\":\"000_000_0000\",\"Servicemodulename\":\"?\"}}}" +
//                "</STRRESP>\n" +
//                "      </n0:ZFM_PIWS_0000Response>\n" +
//                "   </soap-env:Body>\n" +
//                "</soap-env:Envelope>";
////        String tagHeader = "<STRRESP>";
////        String tagTail = "</STRRESP>";
////
////        String jsonStr = xmlToJson.dom4jXml(xmlStr, tagHeader, tagTail, 73, 1);
////        System.out.println(jsonStr.);
////        String[] sss = jsonStr.split(",");
////        System.out.println(jsonStr);
//
//
////        System.out.println(Arrays.toString(sss[0]));
//
////        Stream<String> stream = Arrays.stream(sss);
////        JSONReader jsonStream = new JSONReader((DefaultJSONParser) stream);
////        jsonStream.startObject();
////        while (jsonStream.hasNext()) {//是否有下一个k-v值
////            Object key = jsonStream.readObject();//获取key
////            Object value = jsonStream.readObject();//获取value
////            System.out.println(key + ":" + value);//处理kv值
////        }
////        jsonStream.endObject();//结束读取
////        jsonStream.close();
//
////        Stream<String> strStream = Stream.of(jsonStr);
////        System.out.println(strStream);
////        //流式解析 json 数据
////        JSONReader jsonReader = new JSONReader();
//
//        ArrayList<Object> list = new ArrayList<>();
//        ArrayList<Object> list3 = new ArrayList<>();
//        ArrayList<Object> list4 = new ArrayList<>();
//        ArrayList<Object> list5 = new ArrayList<>();
//        ArrayList<Object> list6 = new ArrayList<>();
//        ArrayList<Object> list2 = new ArrayList<>();
//        ArrayList<Object> list7 = new ArrayList<>();
//        list.add("1");
//        list.add("12");
//        list2.add("17");
//        list3.add("21");
//        list3.add("12");
//        list4.add("13");
//        list4.add("14");
//        list5.add("15");
//        list5.add("16");
//        list6.addAll(list);
//        list6.addAll(list3);
//        list6.addAll(list4);
//        list6.addAll(list5);
//        list6.addAll(list6);
//        list7.addAll(list6);
//        System.out.println(list);
//        System.out.println(list2);
//        System.out.println(list3);
//        System.out.println(list4);
//        System.out.println(list5);
//        System.out.println(list6);
//        System.out.println(list7);
//
//    }
//}
