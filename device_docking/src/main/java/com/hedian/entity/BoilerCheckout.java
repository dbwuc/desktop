package com.hedian.entity;

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
 * 特种设备锅炉检验表
 * </p>
 *
 * @author HC
 * @since 2021-02-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("flow_nv_special_equipment_boiler_checkout")
public class BoilerCheckout extends Model<BoilerCheckout> {

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
     * 关联id
     */
    @TableField("boiler_id")
    private String boilerId;
    /**
     * 检验单位
     */
    @TableField("JYDW")
    private String jydw;
    /**
     * 检验单位代码
     */
    @TableField("JYDWDM")
    private String jydwdm;
    /**
     * 检验日期
     */
    @TableField("JYRQ")
    private Date jyrq;
    /**
     * 检验类别
     */
    @TableField("JYLB")
    private String jylb;
    /**
     * 主要问题
     */
    @TableField("ZYWT")
    private String zywt;
    /**
     * 报告编号
     */
    @TableField("BGBH")
    private String bgbh;
    /**
     * 下次检验日期
     */
    @TableField("XCJYRQ")
    private Date xcjyrq;
    /**
     * 内检日期
     */
    @TableField("NJRQ")
    private Date njrq;
    /**
     * 内检类别
     */
    @TableField("NJLB")
    private String njlb;
    /**
     * 内检主要问题
     */
    @TableField("NJZYWT")
    private String njzywt;
    /**
     * 内检报告编号
     */
    @TableField("NJBGBH")
    private String njbgbh;
    /**
     * 下次内检日期
     */
    @TableField("XCNJRQ")
    private Date xcnjrq;
    /**
     * 外检日期
     */
    @TableField("WJRQ")
    private Date wjrq;
    /**
     * 外检内别
     */
    @TableField("WJLB")
    private String wjlb;
    /**
     * 外检主要问题
     */
    @TableField("WJZYWT")
    private String wjzywt;
    /**
     * 外检报告编号
     */
    @TableField("WJBGBH")
    private String wjbgbh;
    /**
     * 下次外检日期
     */
    @TableField("XCWJRQ")
    private Date xcwjrq;
    /**
     * 创建人
     */
    @TableField("create_id")
    private String createId;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 修改人
     */
    @TableField("modified_id")
    private String modifiedId;
    /**
     * 修改时间
     */
    @TableField("modified_time")
    private Date modifiedTime;
    /**
     * 是否有效数据，1有效，0无效（被删除）
     */
    @TableField("use_flag")
    private Integer useFlag;
    /**
     * 是否可以被删除，0不能被删除，1可被删除，默认为1
     */
    @TableField("del_flag")
    private Integer delFlag;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
