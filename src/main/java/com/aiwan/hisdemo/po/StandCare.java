package com.aiwan.hisdemo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 标准护理
 * @TableName stand_care
 */
@TableName(value ="stand_care")
@Data
public class StandCare implements Serializable {
    /**
     * 护理ID
     */
    @TableId
    private Integer id;

    /**
     * 医院ID
     */
    private Integer hisId;

    /**
     * 护理名称
     */
    private String careName;

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
        StandCare other = (StandCare) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHisId() == null ? other.getHisId() == null : this.getHisId().equals(other.getHisId()))
            && (this.getCareName() == null ? other.getCareName() == null : this.getCareName().equals(other.getCareName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHisId() == null) ? 0 : getHisId().hashCode());
        result = prime * result + ((getCareName() == null) ? 0 : getCareName().hashCode());
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
        sb.append(", careName=").append(careName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
