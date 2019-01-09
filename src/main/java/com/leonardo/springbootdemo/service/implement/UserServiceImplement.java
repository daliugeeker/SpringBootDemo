package com.leonardo.springbootdemo.service.implement;

import com.leonardo.springbootdemo.entity.UserInfo;
import com.leonardo.springbootdemo.mapper.UserInfoMapper;
import com.leonardo.springbootdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> getAllUsers() {
        List<UserInfo> userInfoList = userInfoMapper.getAllUsers();
        return userInfoList;
    }
}
