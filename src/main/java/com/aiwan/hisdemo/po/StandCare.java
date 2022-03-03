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


}
