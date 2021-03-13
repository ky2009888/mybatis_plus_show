package com.ky2009888.apps.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ky2009888.apps.domain.User;
import com.ky2009888.apps.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author ky2009666
 * @Description 用户管理
 * @Date 2021/3/13
 **/
@RequestMapping("/user")
@RestController
public class UserController {
    /**
     * 自动注入用户服务类.
     */
    @Resource
    private UserService userService;

    /**
     * 根据主键查询用户.
     *
     * @param id 主键.
     * @return User。
     */
    @GetMapping("/optOne")
    @ResponseBody
    public User selectOne(Long id) {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("id", id);
        User user = userService.getOne(userQueryWrapper);
        return user;
    }
}
