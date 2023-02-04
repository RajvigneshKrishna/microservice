package com.greens.department.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greens.department.model.Department;
import com.greens.department.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;

	public List<Department> getAllDepartmentData() {
		return departmentRepository.findAll();
	}

	public Department getDepartmentDataById(Long departId) {
		Optional<Department> optDepartData = departmentRepository.findById(departId);
		return optDepartData.get();
	}

	public void saveDepartmentData(Department department) {
		departmentRepository.save(department);
	}

	public void updateDepartmentData(Department department) {
		departmentRepository.save(department);
	}

	public void deleteDepartmentData(Long departId) {
		departmentRepository.deleteById(departId);
	}

}
