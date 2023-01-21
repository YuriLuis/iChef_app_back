package com.api.iChef_app_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IChefAppBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(IChefAppBackendApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "Olá I Chef App";
	}
}
