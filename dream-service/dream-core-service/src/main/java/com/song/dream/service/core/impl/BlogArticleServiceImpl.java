package com.song.dream.service.core.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.song.dream.dal.mapper.BlogArticleMapper;
import com.song.dream.dal.po.BlogArticlePO;
import com.song.dream.service.core.BlogArticleService;
import org.springframework.stereotype.Service;

/**
* @author songzhiquana
* @description 针对表【blog_article(文章表)】的数据库操作Service实现
* @createDate 2023-09-14 21:00:54
*/
@Service
public class BlogArticleServiceImpl extends ServiceImpl<BlogArticleMapper, BlogArticlePO>
    implements BlogArticleService {

}




