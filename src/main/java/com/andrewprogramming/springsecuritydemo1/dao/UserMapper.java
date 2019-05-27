package com.andrewprogramming.springsecuritydemo1.dao;


import com.andrewprogramming.springsecuritydemo1.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @version V1.0.0
 * @Description
 */

@Mapper
@Component
public interface UserMapper {
    
    User getUserFromDatabase(@Param("username") String username);

}
