package com.perfree.service.impl;

import com.perfree.model.User;
import com.perfree.mapper.UserMapper;
import com.perfree.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Perfree
 * @since 2022-03-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
