package com.perfree.filter;

import com.perfree.commons.JwtToken;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.web.filter.authc.BasicHttpAuthenticationFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * Jwt认证过滤器
 * @author Perfree
 */
public class JwtFilter extends BasicHttpAuthenticationFilter {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Override
    protected AuthenticationToken createToken(ServletRequest servletRequest, ServletResponse servletResponse) {
        HttpServletRequest request= (HttpServletRequest) servletRequest;
        String token = request.getHeader("Authorization");
        if(StringUtils.isEmpty(token)) {
            return null;
        }
        return new JwtToken(token);
    }



    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
        HttpServletRequest request= (HttpServletRequest) servletRequest;
        String token=request.getHeader("Authorization");
        if(StringUtils.isEmpty(token)) {
            responseError(servletResponse, "token不存在!");
            return false;
        } else {
            try {
                executeLogin(servletRequest, servletResponse);
                return true;
            }catch (Exception e){
                responseError(servletResponse,e.getMessage());
                return false;
            }
        }
    }

    @Override
    protected boolean onLoginFailure(AuthenticationToken token, AuthenticationException e, ServletRequest request, ServletResponse response) {
        responseError(response,e.getMessage());
        return false;
    }

    @Override
    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
        HttpServletRequest req= (HttpServletRequest) request;
        HttpServletResponse res= (HttpServletResponse) response;
        res.setHeader("Access-Control-Allow-Origin",res.getHeader("Origin"));
        res.setHeader("Access-Control-Allow-Origin", "*");
        res.setHeader("Access-Control-Allow-Headers", "Content-Type,Content-Length, Authorization, Accept,X-Requested-With");
        res.setHeader("Access-Control-Allow-Methods", "PUT,POST,GET,DELETE,OPTIONS");
        if (req.getMethod().equals(RequestMethod.OPTIONS.name())){
            res.setStatus(org.springframework.http.HttpStatus.OK.value());
            return false;
        }
        return super.preHandle(request, response);
    }

    /**
     * 将非法请求跳转到 /unauthorized/**
     */
    private void responseError(ServletResponse response, String message) {
        try {
            HttpServletResponse httpServletResponse = (HttpServletResponse) response;
            message = URLEncoder.encode(message, "UTF-8");
            httpServletResponse.sendRedirect("/401/" + message);
        } catch (IOException e) {
            e.printStackTrace();
            LOGGER.error(e.getMessage());
        }
    }
}
