package com.song.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ArticleController
 * @Description
 * @Author songzhiquana
 * @Date 18:17 2023/9/14
 * @Version 1.0
 **/
@RestController
public class ArticleController {

    @GetMapping("query")
    public String queryArticle(){
        return "hello yangyang";
    }
}
