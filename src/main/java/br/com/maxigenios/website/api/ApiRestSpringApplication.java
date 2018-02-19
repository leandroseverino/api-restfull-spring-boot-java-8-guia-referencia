package br.com.maxigenios.website.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.maxigenios.website.api.util.PasswordUtil;

@SpringBootApplication
public class ApiRestSpringApplication {

	@Value("${paginacao.qtd_por_pagina}")
	private int qdtPorPagina;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiRestSpringApplication.class, args);
		System.out.println("Meu primeiro projeto...");
	}
	
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			String encodedPassword = PasswordUtil.generateBCrypt("123456");
			System.out.println("Encoded Password:  " + encodedPassword);
			
			encodedPassword = PasswordUtil.generateBCrypt("123456");
			System.out.println("New Encoded Password:  " + encodedPassword);
			
			System.out.println("is a valid password ? " + PasswordUtil.isValid("123456", encodedPassword));
			
			
		};
	}
}
