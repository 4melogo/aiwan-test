package hisdemo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 医嘱检验
 * @TableName yz_lis
 */
@TableName(value ="yz_lis")
@Data
public class YzLis implements Serializable {
    /**
     * 检验ID
     */
    @TableId
    private Integer id;

    /**
     * 住院号
     */
    private Integer zyId;

    /**
     * 检验名称
     */
    private String laboratoryName;

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
        YzLis other = (YzLis) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getZyId() == null ? other.getZyId() == null : this.getZyId().equals(other.getZyId()))
            && (this.getLaboratoryName() == null ? other.getLaboratoryName() == null : this.getLaboratoryName().equals(other.getLaboratoryName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getZyId() == null) ? 0 : getZyId().hashCode());
        result = prime * result + ((getLaboratoryName() == null) ? 0 : getLaboratoryName().hashCode());
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
        sb.append(", laboratoryName=").append(laboratoryName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}