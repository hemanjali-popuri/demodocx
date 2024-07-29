package com.amdocs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoAqeApplication {
	@GetMapping("/msg")
	public String show() {
		return "Hi Hemanjali";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoAqeApplication.class, args);
	}

}
