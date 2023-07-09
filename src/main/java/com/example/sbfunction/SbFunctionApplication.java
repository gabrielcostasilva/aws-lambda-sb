package com.example.sbfunction;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SbFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbFunctionApplication.class, args);
	}

	@Bean
	public Function<String, String> reverse() {
		return (s) -> String.valueOf(new StringBuilder(s).reverse());
	}

}
