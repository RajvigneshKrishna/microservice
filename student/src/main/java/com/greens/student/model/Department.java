package com.greens.student.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

	private Long departmentId;

	private String departmentName;

	private String departmentCode;

	private String departmentLocation;
}
