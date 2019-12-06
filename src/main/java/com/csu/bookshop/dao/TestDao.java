package com.csu.bookshop.dao;

import com.csu.bookshop.model.User;
import org.springframework.stereotype.Repository;

/**
 * test Mybatis
 * by cc
 * 2019/12/6
 */

//@Mapper
@Repository
public interface TestDao {

    public User getUser(int id);
}
