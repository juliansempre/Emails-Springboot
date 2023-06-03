package com.example.enviaremail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@RestController
public class EnviaremailApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnviaremailApplication.class, args);
	}
	@GetMapping("/ola")
	public String index(){
		return "Olá mundo, com o spring boot";
	}
}
