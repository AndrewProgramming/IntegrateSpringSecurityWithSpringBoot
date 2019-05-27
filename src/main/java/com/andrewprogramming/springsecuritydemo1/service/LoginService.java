package com.andrewprogramming.springsecuritydemo1.service;


import com.andrewprogramming.springsecuritydemo1.model.LoginDetail;
import com.andrewprogramming.springsecuritydemo1.model.TokenDetail;

public interface LoginService {

    LoginDetail getLoginDetail(String username);

    String generateToken(TokenDetail tokenDetail);

}
