package com.example.kotoleksiihomeworkspringboot10.repository;

import com.example.kotoleksiihomeworkspringboot10.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
