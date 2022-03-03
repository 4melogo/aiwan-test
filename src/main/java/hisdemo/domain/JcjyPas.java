package hisdemo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 检查检验结果-检查
 * @TableName jcjy_pas
 */
@TableName(value ="jcjy_pas")
@Data
public class JcjyPas implements Serializable {
    /**
     * 检查ID
     */
    @TableId
    private Integer id;

    /**
     * 住院号
     */
    private Integer zyId;

    /**
     * 检查名称
     */
    private String pasName;

    /**
     * 检查结果
     */
    private String pasResult;

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
        JcjyPas other = (JcjyPas) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getZyId() == null ? other.getZyId() == null : this.getZyId().equals(other.getZyId()))
            && (this.getPasName() == null ? other.getPasName() == null : this.getPasName().equals(other.getPasName()))
            && (this.getPasResult() == null ? other.getPasResult() == null : this.getPasResult().equals(other.getPasResult()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getZyId() == null) ? 0 : getZyId().hashCode());
        result = prime * result + ((getPasName() == null) ? 0 : getPasName().hashCode());
        result = prime * result + ((getPasResult() == null) ? 0 : getPasResult().hashCode());
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
        sb.append(", pasName=").append(pasName);
        sb.append(", pasResult=").append(pasResult);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}