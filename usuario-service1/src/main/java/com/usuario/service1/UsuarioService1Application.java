package com.usuario.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class UsuarioService1Application {

	public static void main(String[] args) {
		SpringApplication.run(UsuarioService1Application.class, args);
	}

}
