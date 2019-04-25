package com.example.springbootrest.domain;

import java.util.ArrayList;
import java.util.List;

public class Users {

	private List<User> employeeList;

	public List<User> getEmployeeList() {
		if (employeeList == null) {
			employeeList = new ArrayList<>();
		}
		return employeeList;
	}

	public void setEmployeeList(List<User> employeeList) {
		this.employeeList = employeeList;
	}

}
