package com.aiwan.hisdemo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 医嘱护理
 * @TableName yz_care
 */
@TableName(value ="yz_care")
@Data
public class YzCare implements Serializable {
    /**
     * 护理ID
     */
    @TableId
    private Integer id;

    /**
     * 住院号
     */
    private Integer zyId;

    /**
     * 护理名称
     */
    private String careName;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}
