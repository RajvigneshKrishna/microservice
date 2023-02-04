package com.greens.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.greens.student.model.Department;
import com.greens.student.model.Student;
import com.greens.student.model.StudentResponseTemplate;
import com.greens.student.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	RestTemplate restTemplate;

	public StudentResponseTemplate getStudentDataById(Long studentId) {
		Student student = studentRepository.findById(studentId).get();
		Long departId = student.getDepartmentId();
		System.out.println(departId);
		String departUrl = "http://DEPARTMENT-SERVICE/department/getDepartmentById/" + departId;
		Department department = restTemplate.getForObject(departUrl, Department.class);
		StudentResponseTemplate stdntRspnsTmplt = new StudentResponseTemplate();
		stdntRspnsTmplt.setDepartment(department);
		stdntRspnsTmplt.setStudent(student);
		return stdntRspnsTmplt;

	}

	public List<Student> getAllStudentData() {
		return studentRepository.findAll();
	}

}
