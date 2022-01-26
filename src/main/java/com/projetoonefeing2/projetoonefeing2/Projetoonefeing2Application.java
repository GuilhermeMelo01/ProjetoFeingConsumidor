package com.projetoonefeing2.projetoonefeing2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Projetoonefeing2Application {

	public static void main(String[] args) {
		SpringApplication.run(Projetoonefeing2Application.class, args);
	}

}
