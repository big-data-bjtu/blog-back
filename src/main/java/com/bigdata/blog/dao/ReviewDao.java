package com.bigdata.blog.dao;

import com.bigdata.blog.model.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewDao extends CrudRepository<Review,Integer> {
}
