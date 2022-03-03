package hisdemo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 标准药品表
 * @TableName stand_drug
 */
@TableName(value ="stand_drug")
@Data
public class StandDrug implements Serializable {
    /**
     * 药品ID
     */
    @TableId
    private Integer id;

    /**
     * 医院ID
     */
    private Integer hisId;

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
        StandDrug other = (StandDrug) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHisId() == null ? other.getHisId() == null : this.getHisId().equals(other.getHisId()))
            && (this.getAdviceType() == null ? other.getAdviceType() == null : this.getAdviceType().equals(other.getAdviceType()))
            && (this.getDrugName() == null ? other.getDrugName() == null : this.getDrugName().equals(other.getDrugName()))
            && (this.getSingleDosage() == null ? other.getSingleDosage() == null : this.getSingleDosage().equals(other.getSingleDosage()))
            && (this.getSingleDosageUtil() == null ? other.getSingleDosageUtil() == null : this.getSingleDosageUtil().equals(other.getSingleDosageUtil()))
            && (this.getAdministrationRoute() == null ? other.getAdministrationRoute() == null : this.getAdministrationRoute().equals(other.getAdministrationRoute()))
            && (this.getMedicationFrequency() == null ? other.getMedicationFrequency() == null : this.getMedicationFrequency().equals(other.getMedicationFrequency()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHisId() == null) ? 0 : getHisId().hashCode());
        result = prime * result + ((getAdviceType() == null) ? 0 : getAdviceType().hashCode());
        result = prime * result + ((getDrugName() == null) ? 0 : getDrugName().hashCode());
        result = prime * result + ((getSingleDosage() == null) ? 0 : getSingleDosage().hashCode());
        result = prime * result + ((getSingleDosageUtil() == null) ? 0 : getSingleDosageUtil().hashCode());
        result = prime * result + ((getAdministrationRoute() == null) ? 0 : getAdministrationRoute().hashCode());
        result = prime * result + ((getMedicationFrequency() == null) ? 0 : getMedicationFrequency().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hisId=").append(hisId);
        sb.append(", adviceType=").append(adviceType);
        sb.append(", drugName=").append(drugName);
        sb.append(", singleDosage=").append(singleDosage);
        sb.append(", singleDosageUtil=").append(singleDosageUtil);
        sb.append(", administrationRoute=").append(administrationRoute);
        sb.append(", medicationFrequency=").append(medicationFrequency);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}