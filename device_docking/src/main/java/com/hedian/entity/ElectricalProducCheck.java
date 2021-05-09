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
 * 特种设备机电检验表
 * </p>
 *
 * @author HC
 * @since 2021-02-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("flow_nv_special_equipment_electrical_produc_check")
public class ElectricalProducCheck extends Model<ElectricalProducCheck> {

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
     * 关联机电类id
     */
    @TableField("electrical_id")
    private String electricalId;
    /**
     * 检验日期
     */
    @TableField("JYRQ")
    private Date jyrq;
    /**
     * 下检日期
     */
    @TableField("XJRQ")
    private Date xjrq;
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
