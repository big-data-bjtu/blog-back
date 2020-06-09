package com.bigdata.blog.dao;

import com.bigdata.blog.model.Interest;
import org.springframework.data.repository.CrudRepository;

public interface InterestDao extends CrudRepository<Interest,Integer> {
}
