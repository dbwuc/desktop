package com.hedian.entity;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;


import lombok.*;
import lombok.experimental.Accessors;

/**
 * <p>
 * 特种设备锅炉基础信息表
 * </p>
 *
 * @author HC
 * @since 2021-02-07
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("flow_nv_special_equipment_boiler")
public class Boiler extends Model<Boiler> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;
    /**
     * 企业id
     */
    @TableField("department_id")
    private String departmentId;
    /**
     * 单位内部编号
     */
    @TableField("DWNBBH")
    private String dwnbbh;
    /**
     * 锅炉名称
     */
    @TableField("GLMC")
    private String glmc;
    /**
     * 锅炉型号
     */
    @TableField("GLXH")
    private String glxh;
    /**
     * 锅炉房类型
     */
    @TableField("GLFLX")
    private String glflx;
    /**
     * 锅炉种类
     */
    @TableField("GLZL")
    private String glzl;
    /**
     * 锅炉品种
     */
    @TableField("GLPZ")
    private String glpz;
    /**
     * 锅炉用途
     */
    @TableField("GLYT")
    private String glyt;
    /**
     * 所在地点
     */
    @TableField("SZDD")
    private String szdd;
    /**
     * 联系电话
     */
    @TableField("LXDH")
    private String lxdh;
    /**
     * 出厂编号
     */
    @TableField("CCBH")
    private String ccbh;
    /**
     * 设备状态
     */
    @TableField("SBZT")
    private String sbzt;
    /**
     * 使用状态
     */
    @TableField("SYZT")
    private String syzt;
    /**
     * 投用日期
     */
    @TableField("TYRQ")
    private Date tyrq;
    /**
     * 注册状态
     */
    @TableField("ZCZT")
    private String zczt;
    /**
     * 原注册代码
     */
    @TableField("YZCDM")
    private String yzcdm;
    /**
     * 主管部门名称
     */
    @TableField("ZGBMMC")
    private String zgbmmc;
    /**
     * 主管部门编号
     */
    @TableField("ZGBMBH")
    private String zgbmbh;
    /**
     * 资产原值
     */
    @TableField("ZCYZ")
    private BigDecimal zcyz;
    /**
     * 资产净值
     */
    @TableField("ZCJZ")
    private BigDecimal zcjz;
    /**
     * 是否电站锅炉
     */
    @TableField("SFDZGL")
    private String sfdzgl;
    /**
     * 是否可以删除标记：0 不能删除， 1可以删除， 默认 1
     */
    @TableField("del_flag")
    private Integer delFlag;
    /**
     * 使用标记：1 使用 0 不使用
     */
    @TableField("use_flag")
    private Integer useFlag;
    /**
     * 创建人ID
     */
    @TableField("create_id")
    private String createId;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 修改人ID
     */
    @TableField("modified_id")
    private String modifiedId;
    /**
     * 修改时间
     */
    @TableField("modified_time")
    private Date modifiedTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
