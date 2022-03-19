package com.perfree.controller;

import com.perfree.model.User;
import com.perfree.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private UserService service;

    @RequestMapping("/")
    public User index() {
        return service.getLoginInfo("perfree");
    }
}
