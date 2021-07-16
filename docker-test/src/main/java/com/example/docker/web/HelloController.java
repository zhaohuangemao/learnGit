package com.example.docker.web;


import com.example.docker.bean.User;
import com.example.docker.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, SpringBoot With Docker";
    }

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/user")
    public List<User> select() {
        List<User> userList = userMapper.selectList(null);
        return userList;
    }

    @RequestMapping("/add")
    public void add() {
        for (int i = 0; i < 100; i++) {
            User user = new User();
            user.setAge(i);
            user.setEmail("xxx@163.com-" + i);
            user.setName("lk" + i);
            userMapper.insert(user);
        }
    }

}
