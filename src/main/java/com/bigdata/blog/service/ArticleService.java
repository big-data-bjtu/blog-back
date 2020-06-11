package com.bigdata.blog.service;

import com.bigdata.blog.dao.ArticleDao;
import com.bigdata.blog.dto.Message;
import com.bigdata.blog.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArticleService {

    @Autowired
    private ArticleDao articleDao;

    /**
     * 查询某篇文章的详细信息
     * @param articleId 文章id
     * @return 该文章所有信息
     */
    public Object getOneArticle(int articleId){
        Optional<Article> articleOptional = articleDao.findById(articleId);
        if (articleOptional.isPresent()){
            return articleOptional.get();
        }else {
            return new Message(-1,"article is null!");
        }
    }


    /**
     * 查询所有文章
     * @return 所有文章的信息。
     */
    public Object findAll(){
        return articleDao.findAll();
    }

    /**
     * 创建一篇文章
     * @param title 题目
     * @param lable 标签
     * @param summary 概述
     * @param content 内容
     * @param type 类型
     * @param authorId 作者id
     * @return 创建成功的信息
     */
    public Object createArticle(String title, String lable, String summary, String content, int type, int authorId){
        Article article = new Article(title, lable, summary, content, type, authorId);
        article.setTime(System.currentTimeMillis());
        article.reSetCount();
        articleDao.save(article);
        return new Message(1,"create success!");
    }

    public void addBrowse(int articleId){
        Optional<Article> articleOptional = articleDao.findById(articleId);
        if (articleOptional.isPresent()){
            Article article = articleOptional.get();
            article.addBrowse();
            articleDao.save(article);
        }
    }

    public void addSupport(int articleId){
        Optional<Article> articleOptional = articleDao.findById(articleId);
        if (articleOptional.isPresent()){
            Article article = articleOptional.get();
            article.addSupport();
            articleDao.save(article);
        }
    }

    public void addCollection(int articleId){
        Optional<Article> articleOptional = articleDao.findById(articleId);
        if (articleOptional.isPresent()){
            Article article = articleOptional.get();
            article.addCollection();
            articleDao.save(article);
        }
    }

    public void addReview(int articleId){
        Optional<Article> articleOptional = articleDao.findById(articleId);
        if (articleOptional.isPresent()){
            Article article = articleOptional.get();
            article.addReview();
            articleDao.save(article);
        }
    }



}
