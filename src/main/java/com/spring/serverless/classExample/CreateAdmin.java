package com.spring.serverless.classExample;

import java.util.function.Function;

import com.spring.serverless.model.AdminModel;

public class CreateAdmin implements Function<AdminModel, AdminModel> {
    @Override 
    public AdminModel apply(AdminModel adminRequest) {
    	AdminModel adminResponse = new AdminModel();
    	adminResponse.setUserName(adminRequest.getUserName());
        return adminResponse;
    }
}
