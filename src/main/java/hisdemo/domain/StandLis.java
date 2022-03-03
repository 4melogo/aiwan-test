package hisdemo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 标准检验表
 * @TableName stand_lis
 */
@TableName(value ="stand_lis")
@Data
public class StandLis implements Serializable {
    /**
     * 检验ID
     */
    @TableId
    private Integer id;

    /**
     * 医院ID
     */
    private Integer hisId;

    /**
     * 检验名称
     */
    private String laboratoryName;

    /**
     * 细项名称
     */
    private String detailName;

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
        StandLis other = (StandLis) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHisId() == null ? other.getHisId() == null : this.getHisId().equals(other.getHisId()))
            && (this.getLaboratoryName() == null ? other.getLaboratoryName() == null : this.getLaboratoryName().equals(other.getLaboratoryName()))
            && (this.getDetailName() == null ? other.getDetailName() == null : this.getDetailName().equals(other.getDetailName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHisId() == null) ? 0 : getHisId().hashCode());
        result = prime * result + ((getLaboratoryName() == null) ? 0 : getLaboratoryName().hashCode());
        result = prime * result + ((getDetailName() == null) ? 0 : getDetailName().hashCode());
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
        sb.append(", laboratoryName=").append(laboratoryName);
        sb.append(", detailName=").append(detailName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}