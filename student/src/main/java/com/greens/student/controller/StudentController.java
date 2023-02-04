package com.greens.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greens.student.model.Student;
import com.greens.student.model.StudentResponseTemplate;
import com.greens.student.service.StudentService;

@RequestMapping("/student")
@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/getStudentDataById/{id}")
	public StudentResponseTemplate getStudentDataById(@PathVariable("id") Long studentId) {
		return studentService.getStudentDataById(studentId);
	}

	@GetMapping("/getAllStudentData")
	public List<Student> getAllStudentData() {
		return studentService.getAllStudentData();
	}

}
