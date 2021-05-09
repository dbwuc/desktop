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
 * 特种设备压力容器表
 * </p>
 *
 * @author HC
 * @since 2021-02-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("flow_nv_special_equipment_pressure_container")
public class PressureContainer extends Model<PressureContainer> {

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
     * 容器位号
     */
    @TableField("RQWH")
    private String rqwh;
    /**
     * 容器名称
     */
    @TableField("RQMC")
    private String rqmc;
    /**
     * 容器类别
     */
    @TableField("RQLB")
    private String rqlb;
    /**
     * 容器品种
     */
    @TableField("RQPZ")
    private String rqpz;
    /**
     * 容器分类
     */
    @TableField("RQFL")
    private String rqfl;
    /**
     * 压力等级
     */
    @TableField("YLDJ")
    private String yldj;
    /**
     * 容器总重
     */
    @TableField("RQZZ")
    private BigDecimal rqzz;
    /**
     * 壳体重量
     */
    @TableField("QTZL")
    private BigDecimal qtzl;
    /**
     * 内件重量
     */
    @TableField("NJZL")
    private BigDecimal njzl;
    /**
     * 充装重量
     */
    @TableField("CZZL")
    private BigDecimal czzl;
    /**
     * 容器容积
     */
    @TableField("RQRJ")
    private BigDecimal rqrj;
    /**
     * 容器高长
     */
    @TableField("RQGC")
    private BigDecimal rqgc;
    /**
     * 容器内径
     */
    @TableField("RQNJ")
    private BigDecimal rqnj;
    /**
     * 支座型式
     */
    @TableField("ZZXS")
    private String zzxs;
    /**
     * 安装型式
     */
    @TableField("AZXS")
    private String azxs;
    /**
     * 封头型式
     */
    @TableField("FTXS")
    private String ftxs;
    /**
     * 主体结构型式
     */
    @TableField("ZTJGXS")
    private String ztjgxs;
    /**
     * 用途
     */
    @TableField("YT")
    private String yt;
    /**
     * 保温绝热
     */
    @TableField("BWJR")
    private String bwjr;
    /**
     * 保温材质
     */
    @TableField("BWCZ")
    private String bwcz;
    /**
     * 保温厚度
     */
    @TableField("BWHD")
    private BigDecimal bwhd;
    /**
     * 内衬材料
     */
    @TableField("NCCL")
    private String nccl;
    /**
     * 内衬壁厚
     */
    @TableField("NCBH")
    private BigDecimal ncbh;
    /**
     * 筒体材料
     */
    @TableField("TTCL")
    private String ttcl;
    /**
     * 筒体厚度
     */
    @TableField("TTHD")
    private BigDecimal tthd;
    /**
     * 筒体腐蚀裕量
     */
    @TableField("TTFSYL")
    private BigDecimal ttfsyl;
    /**
     * 封头厚度
     */
    @TableField("FTHD")
    private BigDecimal fthd;
    /**
     * 封头材料
     */
    @TableField("FTCL")
    private String ftcl;
    /**
     * 封头腐蚀裕量
     */
    @TableField("FTFSYL")
    private BigDecimal ftfsyl;
    /**
     * 设备代码
     */
    @TableField("SBDM")
    private String sbdm;
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
     * 登记表编号
     */
    @TableField("DJBBH")
    private String djbbh;
    /**
     * 注册登记机构
     */
    @TableField("ZCDJJG")
    private String zcdjjg;
    /**
     * 注册登记机构代码
     */
    @TableField("ZCDJJGDM")
    private String zcdjjgdm;
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
     * 更新日期
     */
    @TableField("GXRQ")
    private Date gxrq;
    /**
     * 投用日期
     */
    @TableField("TYRQ")
    private Date tyrq;
    /**
     * 设计使用年限
     */
    @TableField("SJSYNX")
    private Integer sjsynx;
    /**
     * 运行方式
     */
    @TableField("YXFS")
    private String yxfs;
    /**
     * 使用地点
     */
    @TableField("SYDD")
    private String sydd;
    /**
     * 设备状态
     */
    @TableField("SBZT")
    private String sbzt;
    /**
     * 资产原值
     */
    @TableField("ZCYZ")
    private String zcyz;
    /**
     * 资产净值
     */
    @TableField("ZCJZ")
    private String zcjz;
    /**
     * 特种设备分类
     */
    @TableField("TZSBFL")
    private String tzsbfl;
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
