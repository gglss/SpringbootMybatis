package com.course.controller;


import com.course.entity.user;
import com.course.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName Demo
 * @Description TODO
 * @Author @0_0
 * @Date 2022/10/25 17:50
 * @Version 1.0
 */

@RestController
@RequestMapping("v1")
public class UserController {

    // 首先获取一个执行sql语句的对象
    // @Autowired  启动器加载
    @Autowired
//    private SqlSessionTemplate template;
    private userMapper userMapper;

    /**
     * 获取到用户数
     * @return 用户数量
     */
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public List<user> getUser(){
        List<user> userEntities = userMapper.selectUserMapper();
        for (user user:userEntities){
            System.out.println(user);
        }
        return userEntities;
    }
}
