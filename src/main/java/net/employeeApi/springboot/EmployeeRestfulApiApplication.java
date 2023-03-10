package net.employeeApi.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeRestfulApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRestfulApiApplication.class, args);
		System.out.println("System Start");
	}

}
