package com.hedian.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hedian.base.Ids;
import com.hedian.entity.Boiler;
import org.apache.ibatis.annotations.Param;


/**
 * <p>
 * 特种设备锅炉基础信息表 Mapper 接口
 * </p>
 *
 * @author HC
 * @since 2021-02-07
 */
public interface BoilerMapper extends BaseMapper<Boiler> {

    /**
     * 根据id进行更新
     * @param list
     */
    void updateBoilersByTimeAndId(@Param("list")Ids list);

}
