package com.spring.serverless.functions.Length;

import java.util.function.Function;

public class GetLength implements Function<String, String> {
	 
    @Override
    public String apply(String value) {
    	return new StringBuilder(value).reverse().toString();
    }
}