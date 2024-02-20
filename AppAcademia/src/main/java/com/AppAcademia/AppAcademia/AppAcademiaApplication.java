package com.AppAcademia.AppAcademia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.AppAcademia.AppAcademia")
@EnableJpaRepositories(basePackages = "com.AppAcademia.AppAcademia")
public class AppAcademiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppAcademiaApplication.class, args);
	}


}
