package com.aiwan.hisdemo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 医嘱药品表
 * @TableName yz_drug
 */
@TableName(value ="yz_drug")
@Data
public class YzDrug implements Serializable {
    /**
     * 药品ID
     */
    @TableId
    private Integer id;

    /**
     * 住院号
     */
    private Integer zyId;

    /**
     * 医嘱类型（长期医嘱、短期医嘱）
     */
    private String adviceType;

    /**
     * 药物名称
     */
    private String drugName;

    /**
     * 单次用量
     */
    private Integer singleDosage;

    /**
     * 单次用量单位
     */
    private String singleDosageUtil;

    /**
     * 给药途径
     */
    private String administrationRoute;

    /**
     * 用药频次
     */
    private String medicationFrequency;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}
