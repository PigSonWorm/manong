package com.manong.controller;

import com.manong.pojo.User;
import com.manong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author dk
 * @date 2019-07-31 17:37
 */
@Controller
public class UserController {
    @Resource(name="UserServiceImpl")
    UserService userService;

    @ResponseBody
    @RequestMapping(value="/user/{userid}")
    public User getUserById(@PathVariable Integer userid){
        User user=userService.getUserById(userid);
        return  user;
    }
}
