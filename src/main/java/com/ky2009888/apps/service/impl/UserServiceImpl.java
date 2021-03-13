package com.ky2009888.apps.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ky2009888.apps.domain.User;
import com.ky2009888.apps.service.UserService;
import com.ky2009888.apps.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lenovo
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
implements UserService{

}




