package com.aiwan.hisdemo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 检查检验结果-检验
 * @TableName jcjy_lis
 */
@TableName(value ="jcjy_lis")
@Data
public class JcjyLis implements Serializable {
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
    private String lisName;

    /**
     * 细项名称
     */
    private String detailName;

    /**
     * 检查结果
     */
    private Double lisResult;

    /**
     * 检查结果单位
     */
    private String laboratoryResultUilt;

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
        JcjyLis other = (JcjyLis) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getZyId() == null ? other.getZyId() == null : this.getZyId().equals(other.getZyId()))
            && (this.getLisName() == null ? other.getLisName() == null : this.getLisName().equals(other.getLisName()))
            && (this.getDetailName() == null ? other.getDetailName() == null : this.getDetailName().equals(other.getDetailName()))
            && (this.getLisResult() == null ? other.getLisResult() == null : this.getLisResult().equals(other.getLisResult()))
            && (this.getLaboratoryResultUilt() == null ? other.getLaboratoryResultUilt() == null : this.getLaboratoryResultUilt().equals(other.getLaboratoryResultUilt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getZyId() == null) ? 0 : getZyId().hashCode());
        result = prime * result + ((getLisName() == null) ? 0 : getLisName().hashCode());
        result = prime * result + ((getDetailName() == null) ? 0 : getDetailName().hashCode());
        result = prime * result + ((getLisResult() == null) ? 0 : getLisResult().hashCode());
        result = prime * result + ((getLaboratoryResultUilt() == null) ? 0 : getLaboratoryResultUilt().hashCode());
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
        sb.append(", lisName=").append(lisName);
        sb.append(", detailName=").append(detailName);
        sb.append(", lisResult=").append(lisResult);
        sb.append(", laboratoryResultUilt=").append(laboratoryResultUilt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
