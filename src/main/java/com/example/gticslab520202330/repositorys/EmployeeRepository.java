package com.example.gticslab520202330.repositorys;

import com.example.gticslab520202330.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}