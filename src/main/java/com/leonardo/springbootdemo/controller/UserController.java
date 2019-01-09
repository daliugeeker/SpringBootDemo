package com.leonardo.springbootdemo.controller;

import com.leonardo.springbootdemo.entity.UserInfo;
import com.leonardo.springbootdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

@Autowired
private IUserService iUserService;

    @RequestMapping(value = {"/all"}, produces = {"application/json;charset=UTF-8"},method = RequestMethod.GET)
    public List<UserInfo> getAllResources(){
        return iUserService.getAllUsers();
    }

}
