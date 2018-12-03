package com.example.tim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.example.tim")
public class TimFinalllApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimFinalllApplication.class, args);
	}

}
