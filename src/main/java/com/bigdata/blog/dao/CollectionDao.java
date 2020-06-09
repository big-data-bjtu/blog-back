package com.bigdata.blog.dao;


import com.bigdata.blog.model.Collection;
import org.springframework.data.repository.CrudRepository;

public interface CollectionDao extends CrudRepository<Collection,Integer> {
}
