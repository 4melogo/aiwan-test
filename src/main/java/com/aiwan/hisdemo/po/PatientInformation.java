package com.aiwan.hisdemo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 患者基本信息表
 * @TableName patient_information
 */
@TableName(value ="patient_information")
@Data
public class PatientInformation implements Serializable {
    /**
     * 患者ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 住院号
     */
    private String zyId;

    /**
     * 姓名
     */
    private String patientName;

    /**
     * 性别
     */
    private String patientSex;

    /**
     * 年龄
     */
    private String patientAge;

    /**
     * 诊断
     */
    private String diagnosis;

    /**
     * 科室
     */
    private String department;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 备注
     */
    private String remarks;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


}
