package com.mukundmadhav.springboot.springboot.componet.User.service;

import java.util.List;

import com.mukundmadhav.springboot.springboot.componet.User.modal.Employee;

public interface EmployeeService {
	

	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
	

}
