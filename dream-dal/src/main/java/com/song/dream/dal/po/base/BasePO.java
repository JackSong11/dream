package com.song.dream.dal.po.base;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * 基础实体类
 *
 * @author songzhiquana
 * @version 1.0
 * @description:
 * @date 2023/9/14 7:51 下午
 */
@Data
public class BasePO {

    /**
     * id
     * mybatis-plus框架默认的主键策略就是雪花算法
     */
    private Long id;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createdTime;

    /**
     * 更新人
     */
    private String updatedBy;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updatedTime;

    /**
     * 删除标识（0-未删除，1-已删除）
     * mybatis-plus框架默认的删除逻辑就是0未删除，1删除
     * 默认值: @TableLogic(value = "0",delval = "1")
     */
    @TableLogic
    private Integer isDeleted;

}
