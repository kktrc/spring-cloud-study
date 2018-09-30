package com.pzzls.springcloudfeignproducer.web;

import com.pzzls.springcloudfeignproducer.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {


    private List<User> userList = new ArrayList<>();


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public User add(@RequestBody User user) {

        userList.add(user);
        return user;
    }



    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> list() {

        return userList;
    }
}
