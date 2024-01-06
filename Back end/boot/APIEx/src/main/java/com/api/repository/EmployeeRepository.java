package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
