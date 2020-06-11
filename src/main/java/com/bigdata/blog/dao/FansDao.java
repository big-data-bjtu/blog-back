package com.bigdata.blog.dao;


import com.bigdata.blog.model.Fans;
import org.springframework.data.repository.CrudRepository;

public interface FansDao extends CrudRepository<Fans,Integer> {
}
