package com.aiwan.hisdemo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 医嘱手术
 * @TableName yz_operation
 */
@TableName(value ="yz_operation")
@Data
public class YzOperation implements Serializable {
    /**
     * 手术ID
     */
    @TableId
    private Integer id;

    /**
     * 住院号
     */
    private Integer zyId;

    /**
     * 手术名称
     */
    private String operationName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}
