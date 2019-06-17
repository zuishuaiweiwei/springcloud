package com.bean;

import com.wei.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 为为
 * @create 6/16
 */
@Configuration
public class MyConfig {

    @Bean
    public User user(){
        return new User();
    }
}