package com.leonardo.springbootdemo.service;

import com.leonardo.springbootdemo.entity.UserInfo;

import java.util.List;

public interface IUserService {
    List<UserInfo> getAllUsers();
}
