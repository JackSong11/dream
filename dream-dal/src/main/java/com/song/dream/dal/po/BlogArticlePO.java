package com.song.dream.dal.po;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import com.song.dream.dal.po.base.BasePO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 文章表
 *
 * @TableName blog_article
 */
@TableName(value = "blog_article")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogArticlePO extends BasePO {

    /**
     * 发布日期
     */
    private Date pushDate;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 发表用户
     */
    private Integer userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 点赞数
     */
    private Integer likeCount;

    /**
     * 评论数
     */
    private Integer commentCount;

    /**
     * 浏览量
     */
    private Integer readCount;

    /**
     * 版本号
     */
    @Version
    private Integer version;

}