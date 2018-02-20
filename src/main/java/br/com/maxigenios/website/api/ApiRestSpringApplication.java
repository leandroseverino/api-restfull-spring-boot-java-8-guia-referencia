package br.com.maxigenios.website.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching 
public class ApiRestSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestSpringApplication.class, args);
	}
	
	
//	@Bean
//	public CommandLineRunner commandLineRunner() {
//		return args -> {
//			String encodedPassword = PasswordUtil.generateBCrypt("123456");
//			System.out.println("Encoded Password:  " + encodedPassword);
//			
//			encodedPassword = PasswordUtil.generateBCrypt("123456");
//			System.out.println("New Encoded Password:  " + encodedPassword);
//			
//			System.out.println("is a valid password ? " + PasswordUtil.isValid("123456", encodedPassword));
//			
//			
//		};
//	}
}
