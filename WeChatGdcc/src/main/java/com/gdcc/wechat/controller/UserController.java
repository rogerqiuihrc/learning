package com.gdcc.wechat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gdcc.wechat.model.User;
import com.gdcc.wechat.repository.UserRepository;
import com.gdcc.wechat.service.UserService;

import java.util.Date;

/**
 * Created by qiuqb on 2017/11/17.
 */
@Controller
@RequestMapping("/users")
@EnableAutoConfiguration
public class UserController {

    @Autowired
    private UserService uService;

    @RequestMapping("get")
    @ResponseBody
    public User getUserById(Long id) {
        User u = uService.find(id);       
        System.out.println("id: " + id);
        return u;
    }

    @RequestMapping("save")
    @ResponseBody
    public void saveUser() {
        User u = new User();
        u.setUserName("qqb");
        u.setAddress("广州市连新路171号");
        u.setBirthDay(new Date("1980/08/23"));
        u.setSex("男");
        uService.save(u);
    }

}