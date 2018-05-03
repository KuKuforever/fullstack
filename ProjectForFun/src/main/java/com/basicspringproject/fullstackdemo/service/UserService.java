package com.basicspringproject.fullstackdemo.service;

import com.basicspringproject.fullstackdemo.dao.UserDao;
import com.basicspringproject.fullstackdemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserDao userDao;

    @Autowired
    public UserService (UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> findAll() {
        return userDao.findAll();

    }
}
