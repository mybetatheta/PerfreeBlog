package com.perfree.mapper;

import com.perfree.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Perfree
 * @since 2022-03-19
 */
@Component
public interface UserMapper extends BaseMapper<User> {

    User getLoginInfo(String account);
}
