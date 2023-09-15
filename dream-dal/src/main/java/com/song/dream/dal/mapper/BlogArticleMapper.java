package com.song.dream.dal.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.song.dream.dal.po.BlogArticlePO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
* @author songzhiquana
* @description 针对表【blog_article(文章表)】的数据库操作Mapper
* @createDate 2023-09-14 21:00:54
* @Entity generator.domain.BlogArticle
*/

public interface BlogArticleMapper extends BaseMapper<BlogArticlePO> {

}




