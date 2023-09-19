package com.song.dream.web.controller;

import com.song.dream.dal.po.BlogArticlePO;
import com.song.dream.service.core.BlogArticleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ArticleController
 * @Description
 * @Author songzhiquana
 * @Date 18:17 2023/9/14
 * @Version 1.0
 **/
@RestController
public class ArticleController {

    @Resource
    private BlogArticleService blogArticleService;

    @GetMapping("query")
    public List<BlogArticlePO> queryArticle() {
        List<BlogArticlePO> list = blogArticleService.list();
        return list;
    }

    @GetMapping("insert")
    public boolean insertArticle() {
        BlogArticlePO blogArticlePO = new BlogArticlePO();
        blogArticlePO.setTitle("测试insert");
        boolean save = blogArticleService.save(blogArticlePO);
        return save;
    }

    @GetMapping("delete")
    public boolean deleteArticle() {
        return blogArticleService.removeById(3L);
    }

    @GetMapping("queryVersion")
    public boolean queryVersionArticle() {
        //BlogArticlePO byId = blogArticleService.getById(1703780987949006850L);
        BlogArticlePO byId = new BlogArticlePO();
        byId.setId(1703780987949006850L);
        byId.setTitle("测试insertVersion11");
        //byId.setVersion(10);
        boolean b = blogArticleService.updateById(byId);
        System.out.println(b);
        return b;
    }
}
