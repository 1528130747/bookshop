package com.csu.bookshop.service.serviceImpl;

import com.csu.bookshop.dao.TestDao;
import com.csu.bookshop.model.User;
import com.csu.bookshop.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestDao testDao;

    @Override
    public User getUser(int id) {
        return testDao.getUser(id);
    }
}
