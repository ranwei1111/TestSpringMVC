package com.wran.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.wran.ssm.model.User;
@Repository
public interface IUserDao {
    User selectUserById(@Param("userId") Long userId);
    User selectUserByPhoneOrEmail(@Param("emailOrPhone") String emailOrPhone,@Param("state") Short state);
    List<User> selectAllUser();
}
