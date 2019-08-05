package com.spring.serverless.functions.User;

import java.util.function.Function;

import com.spring.serverless.functions.User.model.User;

public class CreateUser implements Function<User, User> {
    @Override 
    public User apply(User userRequest) {
    	User userResponse = new User();
    	userResponse.setUserName(userRequest.getUserName());
        return userResponse;
    }
}
