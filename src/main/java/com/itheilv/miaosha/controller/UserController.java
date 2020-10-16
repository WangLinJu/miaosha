package com.itheilv.miaosha.controller;


import com.itheilv.miaosha.model.User;
import com.itheilv.miaosha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author WSQ
 * @since 2020-10-16
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get")
    @ResponseBody
    public User getUser(){
        final User user = userService.getById("1");
        System.out.println(user);
        return user;
    }
}

