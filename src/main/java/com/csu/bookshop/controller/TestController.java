package com.csu.bookshop.controller;

import com.csu.bookshop.model.User;
import com.csu.bookshop.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping(value = "/getUser/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable("id") int id){
        return testService.getUser(id);
    }

}
