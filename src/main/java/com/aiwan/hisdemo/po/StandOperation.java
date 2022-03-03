package com.aiwan.hisdemo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 标准手术
 * @TableName stand_operation
 */
@TableName(value ="stand_operation")
@Data
public class StandOperation implements Serializable {
    /**
     * 手术ID
     */
    @TableId
    private Integer id;

    /**
     * 医院ID
     */
    private Integer hisId;

    /**
     * 手术名称
     */
    private String operationName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}
