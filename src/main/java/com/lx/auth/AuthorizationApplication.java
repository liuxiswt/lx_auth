package com.lx.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthorizationApplication {

	public static void main(String[] args) {

		SpringApplication.run(AuthorizationApplication.class, args);
		System.out.println("=================================");
		System.out.println("============启动成功==============");
		System.out.println("=================================");
	}
}
