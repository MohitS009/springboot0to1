package com.mohit.springboot0to1;

import com.mohit.springboot0to1.week1.CakeBaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBoot0to1Application {

	@Autowired
	private CakeBaker cakeBaker;
	public static void main(String[] args) {
		SpringApplication.run(SpringBoot0to1Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(){
		return runner -> {
			weekOneAssignment();
		};
	}
	public void weekOneAssignment(){
		String cakeOrdered = cakeBaker.bakeCake();
		System.out.println(cakeOrdered);
	}
}
