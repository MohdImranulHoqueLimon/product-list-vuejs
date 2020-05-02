package com.vuejs.practice;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Component
@RequestMapping("user/")
public class UserController {

    @GetMapping("list")
    @ResponseBody
    public List<User> home() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "John", 30, "Software Engineer"));
        users.add(new User(2, "Alex", 31, "Accountant"));
        users.add(new User(3, "John", 28, "Marketing Manager"));
        return users;
    }
}
