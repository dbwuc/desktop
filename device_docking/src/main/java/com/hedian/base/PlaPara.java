package com.hedian.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Desc: 平台参数
 * @Author: HC
 * @Since: 2021/2/10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlaPara {

    @Value("${Appid}")
    private String appId;

    @Value("${Appname}")
    private String appName;

    @Value("${Busid}")
    private String busId;

    @Value("${Compressiontype}")
    private String compressionType;

    @Value("${Encryptiontype}")
    private String encryptionType;

    @Value("${Ip}")
    private String ip;

    @Value("${Iscompression}")
    private String isCompression;

    @Value("${Isencryption}")
    private String isEncryption;

    @Value("${MainFormart}")
    private String mainForMart;

    @Value("${MainString}")
    private String mainString;

    @Value("${Password}")
    private String password;

    @Value("${Remark}")
    private String remark;

    @Value("${Serviceappid}")
    private String serviceAppId;

    @Value("${Serviceappname}")
    private String serviceAppName;

    @Value("${Servicemodule}")
    private String serviceModule;

    @Value("${Servicemodulename}")
    private String serviceModuleName;

    @Value("${Servicepassword}")
    private String servicePassWord;

    @Value("${Serviceusername}")
    private String serviceUserName;

    @Value("${Userid}")
    private String userId;

    @Value("${Username}")
    private String userName;

    @Value("${Version}")
    private String version;
}
