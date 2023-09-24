package com.github.throyer.example;

import static java.lang.System.setProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
    setProperty("org.jooq.no-logo", "true");
		SpringApplication.run(ExampleApplication.class, args);
	}

}
