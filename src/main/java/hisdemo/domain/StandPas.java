package hisdemo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 标准检查表
 * @TableName stand_pas
 */
@TableName(value ="stand_pas")
@Data
public class StandPas implements Serializable {
    /**
     * 检查ID
     */
    @TableId
    private Integer id;

    /**
     * 医院ID
     */
    private Integer hisId;

    /**
     * 检查名称
     */
    private String inspectionName;

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
        StandPas other = (StandPas) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHisId() == null ? other.getHisId() == null : this.getHisId().equals(other.getHisId()))
            && (this.getInspectionName() == null ? other.getInspectionName() == null : this.getInspectionName().equals(other.getInspectionName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHisId() == null) ? 0 : getHisId().hashCode());
        result = prime * result + ((getInspectionName() == null) ? 0 : getInspectionName().hashCode());
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
        sb.append(", inspectionName=").append(inspectionName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}