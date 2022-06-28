package com.example.crud_spring_boot.service;

import com.example.crud_spring_boot.dao.UserDao;
import com.example.crud_spring_boot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Transactional
    @Override
    public User get(long id) {
        return userDao.get(id);
    }

    @Transactional
    @Override
    public List<User> list() {
        return userDao.list();
    }

    @Transactional
    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Transactional
    @Override
    public void remove(User user) {
        userDao.remove(user);
    }
}
