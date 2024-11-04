package com.pattern.Jackson;

import com.pattern.Jackson.service.JacksonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class JacksonApplication {

	public static void main(String[] args) throws IOException {
		JacksonService jacksonService = new JacksonService();
		jacksonService.testMethod();
		SpringApplication.run(JacksonApplication.class, args);
	}

}
