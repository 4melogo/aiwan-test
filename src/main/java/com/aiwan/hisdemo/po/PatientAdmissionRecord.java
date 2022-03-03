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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PatientAdmissionRecord other = (PatientAdmissionRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getZyId() == null ? other.getZyId() == null : this.getZyId().equals(other.getZyId()))
            && (this.getDepartment() == null ? other.getDepartment() == null : this.getDepartment().equals(other.getDepartment()))
            && (this.getPatientName() == null ? other.getPatientName() == null : this.getPatientName().equals(other.getPatientName()))
            && (this.getPatientBirth() == null ? other.getPatientBirth() == null : this.getPatientBirth().equals(other.getPatientBirth()))
            && (this.getPatientAge() == null ? other.getPatientAge() == null : this.getPatientAge().equals(other.getPatientAge()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getPatientSex() == null ? other.getPatientSex() == null : this.getPatientSex().equals(other.getPatientSex()))
            && (this.getPatientNationality() == null ? other.getPatientNationality() == null : this.getPatientNationality().equals(other.getPatientNationality()))
            && (this.getBacode() == null ? other.getBacode() == null : this.getBacode().equals(other.getBacode()))
            && (this.getPatientIndate() == null ? other.getPatientIndate() == null : this.getPatientIndate().equals(other.getPatientIndate()))
            && (this.getPatientIndepartment() == null ? other.getPatientIndepartment() == null : this.getPatientIndepartment().equals(other.getPatientIndepartment()))
            && (this.getPatientOutdate() == null ? other.getPatientOutdate() == null : this.getPatientOutdate().equals(other.getPatientOutdate()))
            && (this.getPatientOutdepartment() == null ? other.getPatientOutdepartment() == null : this.getPatientOutdepartment().equals(other.getPatientOutdepartment()))
            && (this.getPatientConsultationDate() == null ? other.getPatientConsultationDate() == null : this.getPatientConsultationDate().equals(other.getPatientConsultationDate()))
            && (this.getPatientConsultationDepartment() == null ? other.getPatientConsultationDepartment() == null : this.getPatientConsultationDepartment().equals(other.getPatientConsultationDepartment()))
            && (this.getComplaint() == null ? other.getComplaint() == null : this.getComplaint().equals(other.getComplaint()))
            && (this.getPresentHistroy() == null ? other.getPresentHistroy() == null : this.getPresentHistroy().equals(other.getPresentHistroy()))
            && (this.getPastHistory() == null ? other.getPastHistory() == null : this.getPastHistory().equals(other.getPastHistory()))
            && (this.getFamilyHistory() == null ? other.getFamilyHistory() == null : this.getFamilyHistory().equals(other.getFamilyHistory()))
            && (this.getAllergicHistory() == null ? other.getAllergicHistory() == null : this.getAllergicHistory().equals(other.getAllergicHistory()))
            && (this.getInfectiousHistory() == null ? other.getInfectiousHistory() == null : this.getInfectiousHistory().equals(other.getInfectiousHistory()))
            && (this.getPersonalLifeHistory() == null ? other.getPersonalLifeHistory() == null : this.getPersonalLifeHistory().equals(other.getPersonalLifeHistory()))
            && (this.getTemperature() == null ? other.getTemperature() == null : this.getTemperature().equals(other.getTemperature()))
            && (this.getPulse() == null ? other.getPulse() == null : this.getPulse().equals(other.getPulse()))
            && (this.getBreathing() == null ? other.getBreathing() == null : this.getBreathing().equals(other.getBreathing()))
            && (this.getLowPressure() == null ? other.getLowPressure() == null : this.getLowPressure().equals(other.getLowPressure()))
            && (this.getHighPressure() == null ? other.getHighPressure() == null : this.getHighPressure().equals(other.getHighPressure()))
            && (this.getSpecialtySituation() == null ? other.getSpecialtySituation() == null : this.getSpecialtySituation().equals(other.getSpecialtySituation()))
            && (this.getSupplementaryExamination() == null ? other.getSupplementaryExamination() == null : this.getSupplementaryExamination().equals(other.getSupplementaryExamination()))
            && (this.getAdmissionDiagnosis() == null ? other.getAdmissionDiagnosis() == null : this.getAdmissionDiagnosis().equals(other.getAdmissionDiagnosis()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getZyId() == null) ? 0 : getZyId().hashCode());
        result = prime * result + ((getDepartment() == null) ? 0 : getDepartment().hashCode());
        result = prime * result + ((getPatientName() == null) ? 0 : getPatientName().hashCode());
        result = prime * result + ((getPatientBirth() == null) ? 0 : getPatientBirth().hashCode());
        result = prime * result + ((getPatientAge() == null) ? 0 : getPatientAge().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getPatientSex() == null) ? 0 : getPatientSex().hashCode());
        result = prime * result + ((getPatientNationality() == null) ? 0 : getPatientNationality().hashCode());
        result = prime * result + ((getBacode() == null) ? 0 : getBacode().hashCode());
        result = prime * result + ((getPatientIndate() == null) ? 0 : getPatientIndate().hashCode());
        result = prime * result + ((getPatientIndepartment() == null) ? 0 : getPatientIndepartment().hashCode());
        result = prime * result + ((getPatientOutdate() == null) ? 0 : getPatientOutdate().hashCode());
        result = prime * result + ((getPatientOutdepartment() == null) ? 0 : getPatientOutdepartment().hashCode());
        result = prime * result + ((getPatientConsultationDate() == null) ? 0 : getPatientConsultationDate().hashCode());
        result = prime * result + ((getPatientConsultationDepartment() == null) ? 0 : getPatientConsultationDepartment().hashCode());
        result = prime * result + ((getComplaint() == null) ? 0 : getComplaint().hashCode());
        result = prime * result + ((getPresentHistroy() == null) ? 0 : getPresentHistroy().hashCode());
        result = prime * result + ((getPastHistory() == null) ? 0 : getPastHistory().hashCode());
        result = prime * result + ((getFamilyHistory() == null) ? 0 : getFamilyHistory().hashCode());
        result = prime * result + ((getAllergicHistory() == null) ? 0 : getAllergicHistory().hashCode());
        result = prime * result + ((getInfectiousHistory() == null) ? 0 : getInfectiousHistory().hashCode());
        result = prime * result + ((getPersonalLifeHistory() == null) ? 0 : getPersonalLifeHistory().hashCode());
        result = prime * result + ((getTemperature() == null) ? 0 : getTemperature().hashCode());
        result = prime * result + ((getPulse() == null) ? 0 : getPulse().hashCode());
        result = prime * result + ((getBreathing() == null) ? 0 : getBreathing().hashCode());
        result = prime * result + ((getLowPressure() == null) ? 0 : getLowPressure().hashCode());
        result = prime * result + ((getHighPressure() == null) ? 0 : getHighPressure().hashCode());
        result = prime * result + ((getSpecialtySituation() == null) ? 0 : getSpecialtySituation().hashCode());
        result = prime * result + ((getSupplementaryExamination() == null) ? 0 : getSupplementaryExamination().hashCode());
        result = prime * result + ((getAdmissionDiagnosis() == null) ? 0 : getAdmissionDiagnosis().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", zyId=").append(zyId);
        sb.append(", department=").append(department);
        sb.append(", patientName=").append(patientName);
        sb.append(", patientBirth=").append(patientBirth);
        sb.append(", patientAge=").append(patientAge);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", patientSex=").append(patientSex);
        sb.append(", patientNationality=").append(patientNationality);
        sb.append(", bacode=").append(bacode);
        sb.append(", patientIndate=").append(patientIndate);
        sb.append(", patientIndepartment=").append(patientIndepartment);
        sb.append(", patientOutdate=").append(patientOutdate);
        sb.append(", patientOutdepartment=").append(patientOutdepartment);
        sb.append(", patientConsultationDate=").append(patientConsultationDate);
        sb.append(", patientConsultationDepartment=").append(patientConsultationDepartment);
        sb.append(", complaint=").append(complaint);
        sb.append(", presentHistroy=").append(presentHistroy);
        sb.append(", pastHistory=").append(pastHistory);
        sb.append(", familyHistory=").append(familyHistory);
        sb.append(", allergicHistory=").append(allergicHistory);
        sb.append(", infectiousHistory=").append(infectiousHistory);
        sb.append(", personalLifeHistory=").append(personalLifeHistory);
        sb.append(", temperature=").append(temperature);
        sb.append(", pulse=").append(pulse);
        sb.append(", breathing=").append(breathing);
        sb.append(", lowPressure=").append(lowPressure);
        sb.append(", highPressure=").append(highPressure);
        sb.append(", specialtySituation=").append(specialtySituation);
        sb.append(", supplementaryExamination=").append(supplementaryExamination);
        sb.append(", admissionDiagnosis=").append(admissionDiagnosis);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
