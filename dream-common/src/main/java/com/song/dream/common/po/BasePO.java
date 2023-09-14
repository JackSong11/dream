package com.song.dream.common.po;

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
     */
    private Long id;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新人
     */
    private String updatedBy;

    /**
     * 更新时间
     */
    private Date updatedTime;

    /**
     * 删除标识（0-未删除，1-已删除）
     */
    // todo @TableLogic
    private Integer delFlag;

}
