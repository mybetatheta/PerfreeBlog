package com.perfree.service;

import com.perfree.model.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Perfree
 * @since 2022-03-19
 */
public interface UserService extends IService<User> {

    User getLoginInfo(String username);
}
