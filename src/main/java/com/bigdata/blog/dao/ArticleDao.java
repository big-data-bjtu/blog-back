package com.bigdata.blog.dao;

import com.bigdata.blog.model.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleDao extends CrudRepository<Article,Integer> {
}
