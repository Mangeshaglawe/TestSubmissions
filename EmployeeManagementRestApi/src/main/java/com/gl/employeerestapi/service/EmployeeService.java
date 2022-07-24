package com.gl.employeerestapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.employeerestapi.model.Employee;
import com.gl.employeerestapi.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {

	@Autowired
	private final EmployeeRepository employeeRepository;
	
	@Transactional
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	@Transactional
	public List<Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}

	@Transactional
	public Employee findById(long id) {
		return employeeRepository.findById(id).orElseThrow(()->new IllegalArgumentException("No employee found."));
	}

	@Transactional
	public void deleteEmployee(long id) {
		employeeRepository.deleteById(id);
	}
	
	@Transactional
	public Employee updateEmployee(Employee employee, long employeeId) {
		return employeeRepository.save(employee);
	}
}
