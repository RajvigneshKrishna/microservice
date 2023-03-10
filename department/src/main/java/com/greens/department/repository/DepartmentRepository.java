package com.greens.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greens.department.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
