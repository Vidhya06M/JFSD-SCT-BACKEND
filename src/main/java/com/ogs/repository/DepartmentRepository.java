package com.ogs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ogs.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}