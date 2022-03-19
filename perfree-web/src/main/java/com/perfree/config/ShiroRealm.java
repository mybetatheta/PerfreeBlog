package com.perfree.config;

import com.perfree.commons.JwtToken;
import com.perfree.commons.JwtUtil;
import com.perfree.model.User;
import com.perfree.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * 自定义ShiroRealm
 */
@Component
public class ShiroRealm extends AuthorizingRealm {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JwtToken;
    }
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String token = principals.toString();
        String account = JwtUtil.getUsername(token);
        if (StringUtils.isBlank(account)) {
            throw new AuthenticationException("token认证失败");
        }
        User user = userService.getLoginInfo(account);
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addRole(user.getRole().getCode());
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken auth) throws UnauthorizedException {
        String jwt = (String) auth.getCredentials();
        String username;
//        try {
//            username= JwtUtil.getUsername(jwt);
//        }catch (Exception e){
//            throw new AuthenticationException("token验证失败,请重新登录");
//        }
//        if (StringUtils.isBlank(username)){
//            throw new AuthenticationException("token验证失败,请重新登录");
//        }
//        User user= userService.getLoginInfo(username);
//        if (user == null){
//            throw new AuthenticationException("token验证失败,请重新登录");
//        }
//        if (!JwtUtil.verify(jwt, user.getUserCode(), user.getPassword())){
//            throw new AuthenticationException("token验证失败,请重新登录");
//        }
        return new SimpleAuthenticationInfo(jwt, jwt, getName());
    }
}
