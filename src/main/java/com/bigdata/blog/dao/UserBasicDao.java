package com.bigdata.blog.dao;

import com.bigdata.blog.model.UserBasic;
import org.springframework.data.repository.CrudRepository;

public interface UserBasicDao extends CrudRepository<UserBasic,Integer> {
}
