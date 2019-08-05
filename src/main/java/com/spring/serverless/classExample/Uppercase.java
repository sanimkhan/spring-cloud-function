package com.spring.serverless.classExample;

import java.util.function.Function;

import com.spring.serverless.model.Model;

public class Uppercase implements Function<Model, Model> {
    @Override 
    public Model apply(Model model) {
    	String upperCase = model.getValue().toUpperCase();
    	model.setValue(upperCase);
        return model;
    }
}
