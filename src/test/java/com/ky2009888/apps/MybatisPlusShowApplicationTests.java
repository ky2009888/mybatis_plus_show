package com.ky2009888.apps;

import com.ky2009888.apps.domain.User;
import com.ky2009888.apps.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
@Slf4j
class MybatisPlusShowApplicationTests {
    /**
     * 自动注入userMapper.
     */
    @Resource
    private UserMapper userMapper;

    /**
     * 查询用户.
     */
    @Test
    void selectUser() {
        User user = userMapper.selectById(1);
        log.info("user info:{}", user.toString());
    }

    /**
     * 添加用户.
     */
    @Test
    void addUser() {
        for (int i = 3; i < 100; i++) {
            userMapper.insert(new User(Long.parseLong(i + ""), "jijinliang", i, "2345@qq.com"));
        }
    }

    /**
     * 更新用户.
     */
    @Test
    void updateUser() {
        userMapper.updateById(new User(Long.parseLong("2"), "jimanning", 11, "26890@qq.com"));
    }

    /**
     * 删除用户.
     */
    @Test
    void deleteUser() {
        userMapper.deleteById(99);
        List<User> users = userMapper.selectList(null);
        log.info("users:{}", users.toString());
    }

    @Test
    void contextLoads() {
    }

}
