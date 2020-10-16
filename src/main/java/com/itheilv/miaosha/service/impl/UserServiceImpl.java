package com.itheilv.miaosha.service.impl;

import com.itheilv.miaosha.model.User;
import com.itheilv.miaosha.mapper.UserMapper;
import com.itheilv.miaosha.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WSQ
 * @since 2020-10-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
