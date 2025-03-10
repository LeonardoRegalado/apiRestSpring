package com.apiRestProyect.mvnApiRestSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class MvnApiRestSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvnApiRestSystemApplication.class, args);
	}
	@GetMapping("/api")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
    	return String.format("Hello %s esta es la api rest", name);
    }
}
