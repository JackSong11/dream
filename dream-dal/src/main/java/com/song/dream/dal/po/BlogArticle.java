package com.song.dream.dal.po;

import java.util.Date;
//import com.song.dream.common;

/**
 * 文章表
 * @TableName blog_article
 */
//@TableName(value ="blog_article")
//@Data
public class BlogArticle {

    private static final long serialVersionUID = 1L;

    /**
     * 文章Id
     */
//    @TableId
    private Long articleId;

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

}