package com.spring.serverless.classExample;

import java.util.function.Function;

public class GetLength implements Function<String, Integer> {
	 
    @Override
    public Integer apply(String value) {
    	return value.length();
    }
}
