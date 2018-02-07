package com.wran.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wran.ssm.dao.IUserDao;
import com.wran.ssm.model.User;
import com.wran.ssm.service.IUserService;
@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private IUserDao userDao;
    @Override
    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }

    @Override
    public User getUserByPhoneOrEmail(String emailOrPhone, Short state) {
        return userDao.selectUserByPhoneOrEmail(emailOrPhone, state);
    }

    @Override
    public User getUserById(Long userId) {
        return userDao.selectUserById(userId);
    }

}
