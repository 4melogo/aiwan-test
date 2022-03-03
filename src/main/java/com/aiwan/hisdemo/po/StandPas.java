package com.aiwan.hisdemo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 标准检查表
 * @TableName stand_pas
 */
@TableName(value ="stand_pas")
@Data
public class StandPas implements Serializable {
    /**
     * 检查ID
     */
    @TableId
    private Integer id;

    /**
     * 医院ID
     */
    private Integer hisId;

    /**
     * 检查名称
     */
    private String inspectionName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}
