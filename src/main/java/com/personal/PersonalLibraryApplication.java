package com.personal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.personal")
public class PersonalLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalLibraryApplication.class, args);
	}

}
