package ru.novotelecom.yahomeauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class YahomeAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(YahomeAuthApplication.class, args);
	}

}
