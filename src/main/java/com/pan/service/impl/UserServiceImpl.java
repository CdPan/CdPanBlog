package com.pan.service.impl;

import com.pan.dao.UserDao;
import com.pan.entity.User;
import com.pan.service.UserService;
import com.pan.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public  User checkUser(String username,String password){
//        User user = userDao.findByUsernameAndPassword(username,password);
        User user = userDao.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }


}
