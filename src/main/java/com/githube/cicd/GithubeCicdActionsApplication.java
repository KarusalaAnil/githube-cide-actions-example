package com.githube.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubeCicdActionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubeCicdActionsApplication.class, args);
	}

	@GetMapping("/welcome")
	public String print() {
		return "Welcome to github CI/CD project";
	}
}
