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
 * 特种设备压力管道表
 * </p>
 *
 * @author HC
 * @since 2021-02-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("flow_nv_special_equipment_pressure_pipe")
public class PressurePipe extends Model<PressurePipe> {

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
     * 管道编号
     */
    @TableField("GDBH")
    private String gdbh;
    /**
     * 管道名称
     */
    @TableField("GDMC")
    private String gdmc;
    /**
     * 管道级别
     */
    @TableField("GDJB")
    private String gdjb;
    /**
     * 操作压力
     */
    @TableField("CZYL")
    private String czyl;
    /**
     * 操作温度
     */
    @TableField("CZWD")
    private String czwd;
    /**
     * 设计压力
     */
    @TableField("SJYL")
    private String sjyl;
    /**
     * 设计温度
     */
    @TableField("SJWD")
    private String sjwd;
    /**
     * 介质名称
     */
    @TableField("JZMC")
    private String jzmc;
    /**
     * 介质状态
     */
    @TableField("JZZT")
    private String jzzt;
    /**
     * 管道标识
     */
    @TableField("GDBS")
    private String gdbs;
    /**
     * 管道起点
     */
    @TableField("GDQD")
    private String gdqd;
    /**
     * 管道止点
     */
    @TableField("GDZD")
    private String gdzd;
    /**
     * 累计长度m
     */
    @TableField("LJCD")
    private BigDecimal ljcd;
    /**
     * 公制公称直径mm
     */
    @TableField("GZGCZJ")
    private BigDecimal gzgczj;
    /**
     * 英制公称直径英寸
     */
    @TableField("YZGCZJ")
    private BigDecimal yzgczj;
    /**
     * 公称壁厚mm
     */
    @TableField("GCBH")
    private BigDecimal gcbh;
    /**
     * 管道材质
     */
    @TableField("GDCZ")
    private String gdcz;
    /**
     * 实际使用时间
     */
    @TableField("SJSYSJ")
    private String sjsysj;
    /**
     * 投用日期
     */
    @TableField("TYRQ")
    private Date tyrq;
    /**
     * 腐蚀裕量mm
     */
    @TableField("FSYL")
    private BigDecimal fsyl;
    /**
     * 单线图号
     */
    @TableField("DXTH")
    private String dxth;
    /**
     * 焊口数量
     */
    @TableField("HKSL")
    private Integer hksl;
    /**
     * 弯头数量
     */
    @TableField("WTSL")
    private Integer wtsl;
    /**
     * 空视图数量
     */
    @TableField("KSTSL")
    private Integer kstsl;
    /**
     * 探伤比例%
     */
    @TableField("TSBL")
    private BigDecimal tsbl;
    /**
     * 铺设方式
     */
    @TableField("PSFS")
    private String psfs;
    /**
     * 资料档案编号
     */
    @TableField("ZLDABH")
    private String zldabh;
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
     * 注册登记日期
     */
    @TableField("ZCDJRQ")
    private String zcdjrq;
    /**
     * 设计使用年限（年）
     */
    @TableField("SJSYNX")
    private Integer sjsynx;
    /**
     * 设备状态
     */
    @TableField("SBZT")
    private String sbzt;
    /**
     * 评估状态 是否监督使用 0否 1是
     */
    @TableField("PGZT")
    private Integer pgzt;
    /**
     * 工艺管道分类
     */
    @TableField("GYGDFL")
    private String gygdfl;
    /**
     * PID图号
     */
    @TableField("PIDTH")
    private String pidth;
    /**
     * 备注
     */
    @TableField("BZ")
    private String bz;
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
