package com.wran.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wran.ssm.model.User;
import com.wran.ssm.service.IUserService;



/**
 * <p>Project: b2bv2</p> 
  * <p>ModuleID: User</p>
  * <p>Comments: 查询是否有此用户</p>
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private Logger LOG = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private IUserService userService;
    @RequestMapping("/query")
    public String showUser(HttpServletRequest request, Model model) {
        LOG.info("开始查询…………");
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList", userList);
        return "user";
    }
}
