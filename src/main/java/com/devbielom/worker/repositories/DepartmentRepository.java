package com.devbielom.worker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devbielom.worker.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
	
}
