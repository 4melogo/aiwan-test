package com.aiwan.hisdemo.po;

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

}
