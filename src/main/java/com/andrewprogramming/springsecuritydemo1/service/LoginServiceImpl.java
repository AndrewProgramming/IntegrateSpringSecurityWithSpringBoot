package com.andrewprogramming.springsecuritydemo1.service;


import com.andrewprogramming.springsecuritydemo1.dao.UserMapper;
import com.andrewprogramming.springsecuritydemo1.model.LoginDetail;
import com.andrewprogramming.springsecuritydemo1.model.TokenDetail;
import com.andrewprogramming.springsecuritydemo1.utils.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version V1.0.0
 * @Description
 *
 */
@Service
public class LoginServiceImpl implements LoginService {

    private final UserMapper userMapper;
    private final TokenUtils tokenUtils;

    @Autowired
    public LoginServiceImpl(UserMapper userMapper, TokenUtils tokenUtils) {
        this.userMapper = userMapper;
        this.tokenUtils = tokenUtils;
    }

    @Override
    public LoginDetail getLoginDetail(String username) {
        return userMapper.getUserFromDatabase(username);
    }

    @Override
    public String generateToken(TokenDetail tokenDetail) {
        return tokenUtils.generateToken(tokenDetail);
    }
}
