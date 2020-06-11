package com.bigdata.blog.controller;

import com.bigdata.blog.service.ArticleService;
import com.bigdata.blog.service.BehaviourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private BehaviourService behaviourService;

    @GetMapping("/list")
    public Object listArticle(){
        return articleService.findAll();
    }

    @GetMapping("/detail")
    public Object detail(int articleId){
        return articleService.getOneArticle(articleId);
    }

    @GetMapping("/review")
    public Object review(int articleId){
        return behaviourService.getArticleReview(articleId);
    }

    @GetMapping("/publish")
    public Object publish(String title, String lable, String summary, String content, int type, int authorId){
        return articleService.createArticle(title, lable, summary, content, type, authorId);
    }


}
