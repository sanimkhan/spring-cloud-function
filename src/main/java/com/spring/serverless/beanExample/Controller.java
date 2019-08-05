package com.spring.serverless.beanExample;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.spring.serverless.model.UserModel;

@Component
public class Controller {

	@Bean
	public Function<String, String> function() {
		return input -> input;
	}

	@Bean
	public Consumer<String> consume() {
		return input -> {
			System.err.println("Input-" + input);
		};
	}

	@Bean
	public Supplier<String> supply() {
		return () -> "Hello from Supplier";
	}

	@Bean
	public Function<UserModel, UserModel> createUser() {
		return userRequest -> {
			UserModel userResponse = new UserModel();
			userResponse.setUserName(userRequest.getUserName());
			return userResponse;
		};
	}

}
