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

}
