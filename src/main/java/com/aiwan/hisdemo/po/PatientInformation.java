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
        PatientInformation other = (PatientInformation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getZyId() == null ? other.getZyId() == null : this.getZyId().equals(other.getZyId()))
            && (this.getPatientName() == null ? other.getPatientName() == null : this.getPatientName().equals(other.getPatientName()))
            && (this.getPatientSex() == null ? other.getPatientSex() == null : this.getPatientSex().equals(other.getPatientSex()))
            && (this.getPatientAge() == null ? other.getPatientAge() == null : this.getPatientAge().equals(other.getPatientAge()))
            && (this.getDiagnosis() == null ? other.getDiagnosis() == null : this.getDiagnosis().equals(other.getDiagnosis()))
            && (this.getDepartment() == null ? other.getDepartment() == null : this.getDepartment().equals(other.getDepartment()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getZyId() == null) ? 0 : getZyId().hashCode());
        result = prime * result + ((getPatientName() == null) ? 0 : getPatientName().hashCode());
        result = prime * result + ((getPatientSex() == null) ? 0 : getPatientSex().hashCode());
        result = prime * result + ((getPatientAge() == null) ? 0 : getPatientAge().hashCode());
        result = prime * result + ((getDiagnosis() == null) ? 0 : getDiagnosis().hashCode());
        result = prime * result + ((getDepartment() == null) ? 0 : getDepartment().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
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
        sb.append(", patientName=").append(patientName);
        sb.append(", patientSex=").append(patientSex);
        sb.append(", patientAge=").append(patientAge);
        sb.append(", diagnosis=").append(diagnosis);
        sb.append(", department=").append(department);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
