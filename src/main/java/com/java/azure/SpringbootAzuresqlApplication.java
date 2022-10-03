package com.java.azure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SpringbootAzuresqlApplication {

	@Autowired
	private EmployeeRepository repo;


	@PostMapping("/employee")
	public Employee adEmployee(@RequestBody Employee employee){

		return repo.save(employee);
	}

	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return repo.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAzuresqlApplication.class, args);
	}

}
