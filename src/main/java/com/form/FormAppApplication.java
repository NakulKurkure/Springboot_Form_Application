package com.form;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@Component("com.form")
@ComponentScan(basePackages = "com.form")
//@ComponentScan("com.form")
public class FormAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormAppApplication.class, args);
	}

}
