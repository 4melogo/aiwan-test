package com.aiwan.hisdemo.po;

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

}
