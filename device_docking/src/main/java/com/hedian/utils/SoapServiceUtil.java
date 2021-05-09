package com.hedian.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.httpclient.SimpleHttpConnectionManager;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpClientParams;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.httpclient.HttpClient;


/**
 * @description:
 * @author: MoWenGe
 * @time: 2020/11/17 14:10
 */
@Slf4j
@Component
public class SoapServiceUtil {

    public static String SendSoap(String webServiceUrl, String serviceAppId, String serviceModule) {
        String result = "ok";
        log.info("webServiceUrl-->" + webServiceUrl);
        if (!StringUtil.isEmpty(webServiceUrl) && !StringUtil.isEmpty(serviceAppId) && !StringUtil.isEmpty(serviceModule)) {
            try {
                // 设置编码。(因为是直接传的xml,所以我们设置为text/xml;charset=utf8)
                final String contentType = "text/xml;charset=utf-8";
                final String content = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:urn=\"urn:sap-com:document:sap:rfc:functions\">\n" +
                        "   <soapenv:Header/>\n" +
                        "   <soapenv:Body>\n" +
                        "      <urn:ZFM_PIWS_0000>\n" +
                        "         <!--Optional:-->\n" +
                        "         <APPID>?</APPID>\n" +
                        "         <!--Optional:-->\n" +
                        "         <APPNAME>?</APPNAME>\n" +
                        "         <!--Optional:-->\n" +
                        "         <BUSID>?</BUSID>\n" +
                        "         <!--Optional:-->\n" +
                        "         <COMPRESSIONTYPE>?</COMPRESSIONTYPE>\n" +
                        "         <!--Optional:-->\n" +
                        "         <ENCRYPTIONTYPE>?</ENCRYPTIONTYPE>\n" +
                        "         <!--Optional:-->\n" +
                        "         <IP>?</IP>\n" +
                        "         <!--Optional:-->\n" +
                        "         <ISCOMPRESSION>?</ISCOMPRESSION>\n" +
                        "         <!--Optional:-->\n" +
                        "         <ISENCRYPTION>?</ISENCRYPTION>\n" +
                        "         <!--Optional:-->\n" +
                        "         <MAINFORMART>?</MAINFORMART>\n" +
                        "         <!--Optional:-->\n" +
                        "         <MAINSTRING>?</MAINSTRING>\n" +
                        "         <!--Optional:-->\n" +
                        "         <PASSWORD>?</PASSWORD>\n" +
                        "         <!--Optional:-->\n" +
                        "         <REMARK>?</REMARK>\n" +
                        "         <!--Optional:-->\n" +
                        "         <SERVICEAPPID>" + serviceAppId + "</SERVICEAPPID>\n" +
                        "         <!--Optional:-->\n" +
                        "         <SERVICEAPPNAME>?</SERVICEAPPNAME>\n" +
                        "         <!--Optional:-->\n" +
                        "         <SERVICEMODULE>" + serviceModule + "</SERVICEMODULE>\n" +
                        "         <!--Optional:-->\n" +
                        "         <SERVICEMODULENAME>?</SERVICEMODULENAME>\n" +
                        "         <!--Optional:-->\n" +
                        "         <SERVICEPASSWORD>?</SERVICEPASSWORD>\n" +
                        "         <!--Optional:-->\n" +
                        "         <SERVICEUSERNAME>?</SERVICEUSERNAME>\n" +
                        "         <!--Optional:-->\n" +
                        "         <USERID>?</USERID>\n" +
                        "         <!--Optional:-->\n" +
                        "         <USERNAME>?</USERNAME>\n" +
                        "         <!--Optional:-->\n" +
                        "         <VERSION>?</VERSION>\n" +
                        "      </urn:ZFM_PIWS_0000>\n" +
                        "   </soapenv:Body>\n" +
                        "</soapenv:Envelope>";
//                String res = doHttpPostByHttpClient(webServiceUrl, contentType, content);
                String res = doHttpPost(webServiceUrl, content);
                log.info("返回xml--->" + res);
                if (!StringUtil.isEmpty(res) || !res.contains("发送短信成功")) {
                    result = "fail";
                }
            } catch (Exception ex) {
                log.error(ex.toString());
                result = ex.toString();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String gh = "";
        try {
            String res = "<?xml version=\"1.0\" encoding=\"utf-8\"?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">" +
                    "<soap:Body><CheckTokenResponse xmlns=\"http://tempuri.org/\">" +
                    "<CheckTokenResult>" +
                    "<string>0</string>" +
                    "<string>50203803</string>" +
                    "<string>返回成功</string>" +
                    "</CheckTokenResult>" +
                    "</CheckTokenResponse></soap:Body></soap:Envelope>";
            res = res.substring(res.indexOf("<CheckTokenResult>"), res.indexOf("</CheckTokenResult>"));
            log.info("返回xml处理后信息--->" + res);
            String strtemp[] = res.split("<string>");
            List<String> strList = new ArrayList<>();
            for (int i = 0; i < strtemp.length; i++) {
                if (strtemp[i].contains("</string>") && strtemp[i].split("</string>").length > 0) {
                    if (!StringUtil.isEmpty(strtemp[i].split("</string>")[0])) {
                        strList.add(strtemp[i].split("</string>")[0]);
                    }
                }
            }
            System.out.println(strList);
            if (!CollectionUtils.isEmpty(strList)) {
                if (strList.get(0).equals("0") && strList.size() > 1) {
                    if (!StringUtil.isEmpty(strList.get(1))) {
                        gh = strList.get(1);
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        System.out.println(gh);
    }

    /**
     * 使用apache的HttpClient发送http
     *
     * @param wsdlURL     请求URL
     * @param contentType 如:application/json;charset=utf8
     * @param content     数据内容
     * @DATE 2018年9月22日 下午10:29:17
     */
    public static String doHttpPostByHttpClient(final String wsdlURL, final String contentType, final String content) throws IOException {
        // 获得Http客户端(可以理解为:你得先有一个浏览器;注意:实际上HttpClient与浏览器是不一样的)
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        // 创建Post请求
        HttpPost httpPost = new HttpPost(wsdlURL);

        StringEntity entity = new StringEntity(content, Charset.forName("UTF-8"));
        // 用户密码
        String username = "RFCWEB";
        String password = "14082414";
//        UsernamePasswordCredentials userPass = new UsernamePasswordCredentials(username, password);
//        httpClient.getState().setCredentials(AuthScope.ANY,userPass);
        // 将数据放入entity中
        httpPost.setEntity(entity);
        httpPost.setHeader("Content-Type", contentType);
//        httpPost.setHeader("Authorization","Basic " + userPass);
        // 响应模型
        CloseableHttpResponse response = null;
        String result = null;
        try {
            // 由客户端执行(发送)Post请求
            response = httpClient.execute(httpPost);
            // 从响应模型中获取响应实体
            // 注意:和doHttpPostByRestTemplate方法用的不是同一个HttpEntity
            org.apache.http.HttpEntity responseEntity = response.getEntity();
            //System.out.println("响应ContentType为:" + responseEntity.getContentType());
            //System.out.println("响应状态为:" + response.getStatusLine());
            if (responseEntity != null) {
                result = EntityUtils.toString(responseEntity);
            }
        } finally {
            // 释放资源
            if (httpClient != null) {
                httpClient.close();
            }
            if (response != null) {
                response.close();
            }
        }
        return result;
    }

    public static String doHttpPost(final String url, final String content) throws IOException {
        // HTTPClient 发送请求
        int timeout = 10000;
        // 创建 http 客户端
        HttpClient httpClient = new HttpClient(new HttpClientParams(),new SimpleHttpConnectionManager(true));

        // 用户密码验证
        String username = "RFCWEB";
        String password = "14082414";
        UsernamePasswordCredentials usePass = new UsernamePasswordCredentials(username, password);
        httpClient.getState().setCredentials(AuthScope.ANY,usePass);

        PostMethod postMethod = new PostMethod(url);

        // 设置连接超时
        httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(timeout);
        // 设置读取时间超时
        httpClient.getHttpConnectionManager().getParams().setSoTimeout(timeout);

        // 把 soap 数据添加到 postMethod
        RequestEntity requestEntity = new StringRequestEntity( "UTF-8");
        // 设置请求头部， 否则可能会报 “no soapaction header” 的错误
        postMethod.setRequestHeader("SOAPAction", "");
        // 设置请求体
        postMethod.setRequestEntity(requestEntity);
        int status = httpClient.executeMethod(postMethod);
        if (status != 200) {
            return "错误代码" + status + ":" + postMethod.getResponseBodyAsString();
        }
        InputStream is = postMethod.getResponseBodyAsStream();
        String isUrl = IOUtils.toString(is);
        postMethod.releaseConnection();

        // 把 soap 数据添加到 postMethod
        PostMethod post = new PostMethod(isUrl);
        RequestEntity entity = new StringRequestEntity(content, "text/xml", "UTF-8");
        post.setRequestHeader("SOAPAction", "");
        post.setRequestEntity(entity);
        int sta = httpClient.executeMethod(post);
        if (sta != 200) {
            return "错误代码" + sta + ":" + postMethod.getResponseBodyAsString();
        }
        String result = null;
        try {
            InputStream responseBodyAsStream = post.getResponseBodyAsStream();
            result = IOUtils.toString(responseBodyAsStream);
            if (result == null) {
                return "获取的数据为空：string------>:" + result;
            }
            log.info("doHttpPost :------>返回数据  :------>:" + result);
        } finally {
            // 释放资源
            post.releaseConnection();
        }
        return result;
    }
}
