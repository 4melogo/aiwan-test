package com.aiwan.hisdemo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 患者入院记录表
 * @TableName patient_admission_record
 */
@TableName(value ="patient_admission_record")
@Data
public class PatientAdmissionRecord implements Serializable {
    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 住院号
     */
    private Integer zyId;

    /**
     * 科室
     */
    private String department;

    /**
     * 患者名称
     */
    private String patientName;

    /**
     * 患者出生日期
     */
    private Date patientBirth;

    /**
     * 年龄
     */
    private String patientAge;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 患者性别（男、女、未知）
     */
    private String patientSex;

    /**
     * 患者国籍
     */
    private String patientNationality;

    /**
     * 病案号
     */
    private String bacode;

    /**
     * 患者入院时间
     */
    private Date patientIndate;

    /**
     * 患者入院科室
     */
    private String patientIndepartment;

    /**
     * 患者出院时间
     */
    private Date patientOutdate;

    /**
     * 患者出院科室
     */
    private String patientOutdepartment;

    /**
     * 患者会诊时间
     */
    private Date patientConsultationDate;

    /**
     * 患者会诊科室
     */
    private String patientConsultationDepartment;

    /**
     * 主诉
     */
    private String complaint;

    /**
     * 现病史
     */
    private String presentHistroy;

    /**
     * 既往史
     */
    private String pastHistory;

    /**
     * 家族史
     */
    private String familyHistory;

    /**
     * 过敏史
     */
    private String allergicHistory;

    /**
     * 传染病史
     */
    private String infectiousHistory;

    /**
     * 个人生活史
     */
    private String personalLifeHistory;

    /**
     * 体格检查温度
     */
    private Integer temperature;

    /**
     * 体格检查脉搏
     */
    private Integer pulse;

    /**
     * 体格检查呼吸
     */
    private Integer breathing;

    /**
     * 体格检查低压
     */
    private Integer lowPressure;

    /**
     * 体格检查高压
     */
    private Integer highPressure;

    /**
     * 专科情况
     */
    private String specialtySituation;

    /**
     * 辅助检查
     */
    private String supplementaryExamination;

    /**
     * 诊断
     */
    private String admissionDiagnosis;

    /**
     * 备注
     */
    private String remarks;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}
