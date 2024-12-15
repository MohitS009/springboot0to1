package com.mohit.springboot0to1;

import com.mohit.springboot0to1.class1.CakeBaker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBoot0to1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot0to1Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(CakeBaker cakeBaker){
		return runner -> {
			cakeBaker.bakeCake();
		};
	}
}
