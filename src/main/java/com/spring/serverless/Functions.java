package com.spring.serverless;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Functions {
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
}
