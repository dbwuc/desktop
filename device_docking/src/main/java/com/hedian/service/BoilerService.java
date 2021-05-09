package com.hedian.service;

import com.hedian.entity.Boiler;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 特种设备锅炉基础信息表 服务类
 * </p>
 *
 * @author HC
 * @since 2021-02-07
 */
public interface BoilerService extends IService<Boiler> {


    Map<String, List<Boiler>> boilerService(String webUrl, String serviceAppId, String serviceModule) throws Exception;
}
