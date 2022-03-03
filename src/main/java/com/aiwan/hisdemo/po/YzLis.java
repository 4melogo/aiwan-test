package com.aiwan.hisdemo.po;

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

}
