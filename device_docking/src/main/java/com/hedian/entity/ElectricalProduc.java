package com.hedian.entity;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 特种设备机电基础信息表
 * </p>
 *
 * @author HC
 * @since 2021-02-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("flow_nv_special_equipment_electrical_produc")
public class ElectricalProduc extends Model<ElectricalProduc> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;
    @TableField("department_id")
    private String departmentId;
    /**
     * 设备类别
     */
    @TableField("SBLB")
    private String sblb;
    /**
     * 单位内编号
     */
    @TableField("DWNBH")
    private String dwnbh;
    /**
     * 设备代码
     */
    @TableField("SBDM")
    private String sbdm;
    /**
     * 设备名称
     */
    @TableField("SBMC")
    private String sbmc;
    /**
     * 设备型号
     */
    @TableField("SBXH")
    private String sbxh;
    /**
     * 注册代码
     */
    @TableField("ZCDM")
    private String zcdm;
    /**
     * 使用证号
     */
    @TableField("SYZH")
    private String syzh;
    /**
     * 注册日期
     */
    @TableField("ZCRQ")
    private Date zcrq;
    /**
     * 注册人员
     */
    @TableField("ZCRY")
    private String zcry;
    /**
     * 注册机构
     */
    @TableField("ZCJG")
    private String zcjg;
    /**
     * 更新日期
     */
    @TableField("GXRQ")
    private Date gxrq;
    /**
     * 登记表编号
     */
    @TableField("DJBBH")
    private String djbbh;
    /**
     * 产权单位
     */
    @TableField("CQDW")
    private String cqdw;
    /**
     * 产权单位代码
     */
    @TableField("CQDWDM")
    private String cqdwdm;
    /**
     * 产权单位地址
     */
    @TableField("CQDWDZ")
    private String cqdwdz;
    /**
     * 产权法人
     */
    @TableField("CQFR")
    private String cqfr;
    /**
     * 产权管理员
     */
    @TableField("CQGLY")
    private String cqgly;
    /**
     * 产权单位电话
     */
    @TableField("CQDWDH")
    private String cqdwdh;
    /**
     * 产权单位邮编
     */
    @TableField("CQDWYB")
    private String cqdwyb;
    /**
     * 使用单位
     */
    @TableField("SYDW")
    private String sydw;
    /**
     * 使用单位代码
     */
    @TableField("SYDWDM")
    private String sydwdm;
    /**
     * 使用单位电话
     */
    @TableField("SYDWDH")
    private String sydwdh;
    /**
     * 使用单位邮编
     */
    @TableField("SYDWYB")
    private String sydwyb;
    /**
     * 使用单位地址
     */
    @TableField("SYDWDZ")
    private String sydwdz;
    /**
     * 使用状态
     */
    @TableField("SYZT")
    private String syzt;
    /**
     * 使用地点
     */
    @TableField("SYDD")
    private String sydd;
    /**
     * 设备操作人员
     */
    @TableField("SBCZRY")
    private String sbczry;
    /**
     * 安全管理部门
     */
    @TableField("AQGLBM")
    private String aqglbm;
    /**
     * 安全管理员
     */
    @TableField("AQGLY")
    private String aqgly;
    /**
     * 设计单位
     */
    @TableField("SJDW")
    private String sjdw;
    /**
     * 设计单位代码
     */
    @TableField("SJDWDM")
    private String sjdwdm;
    /**
     * 设计单位电话
     */
    @TableField("SJDWDH")
    private String sjdwdh;
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
     * 注册状态
     */
    @TableField("ZCZT")
    private String zczt;
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
