package com.codeclan.example.demo;

import com.codeclan.example.demo.models.Department;
import com.codeclan.example.demo.models.Employee;
import com.codeclan.example.demo.repositories.DepartmentRepository;
import com.codeclan.example.demo.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)


@SpringBootTest
class EmployeesDepartmentsApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	void contextLoads() {
		Department shavings = new Department("Shavings");
		departmentRepository.save(shavings);
		Employee bob = new Employee("Bob", "Bobbers", 1234, shavings);
		employeeRepository.save(bob);
	}




}
