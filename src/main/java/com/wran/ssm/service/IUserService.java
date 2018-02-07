package com.wran.ssm.service;

import java.util.List;

import com.wran.ssm.model.User;

public interface IUserService {
    List<User> getAllUser();
    User getUserByPhoneOrEmail(String emailOrPhone,Short state);
    User getUserById(Long userId);
}
