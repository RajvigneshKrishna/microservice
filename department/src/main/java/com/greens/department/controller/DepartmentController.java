package com.greens.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greens.department.model.Department;
import com.greens.department.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;

	@GetMapping("/getAllDepartment")
	public List<Department> getAllDepartmentData() {
		return departmentService.getAllDepartmentData();
	}

	@GetMapping("/getDepartmentById/{id}")
	public Department getDepartmentDataById(@PathVariable("id") Long departId) {
		return departmentService.getDepartmentDataById(departId);
	}

	@PostMapping("/saveDepartment")
	public void saveDepartmentData(@RequestBody Department department) {
		departmentService.saveDepartmentData(department);
	}

	@PutMapping("/updateDepartment")
	public void updateDepartmentData(@RequestBody Department department) {
		departmentService.updateDepartmentData(department);
	}

	@DeleteMapping("/deleteDepartmentById/{id}")
	public void deleteDepartmentData(@PathVariable("id") Long departId) {
		departmentService.deleteDepartmentData(departId);
	}

}
