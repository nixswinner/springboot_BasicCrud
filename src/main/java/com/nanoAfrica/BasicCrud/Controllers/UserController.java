package com.nanoAfrica.BasicCrud.Controllers;


import com.nanoAfrica.BasicCrud.Model.Users;
import com.nanoAfrica.BasicCrud.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/users/signin")
    public String signin(@RequestBody Users user) throws UnsupportedEncodingException {
        return userService.signin(user.getUsername(),user.getPassword());
       // return "Results "+user.getUsername()+user.getPassword();
    }
    @PostMapping(value = "/users/signup")
    public String signup(@RequestBody Users user) throws UnsupportedEncodingException {
        return userService.signup(user);
    }
    @GetMapping(value = "/hello")
    public String hello()
    {
        return "Helllo";
    }

}
