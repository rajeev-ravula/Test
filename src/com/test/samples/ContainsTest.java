package com.test.samples;

import java.util.ArrayList;
import java.util.List;

public class ContainsTest {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Ram", "1"));
		employeeList.add(new Employee("Raj", "2"));
		employeeList.add(new Employee("Ran", "3"));
		System.out.println("employee list contains ram ::: "+employeeList.contains(new Employee("Ram")));
	}

}

class Employee {
	String name;
	String id;
	Employee() {
		
	}
	
	Employee(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	Employee(String name) {
		this.name = name;
	}
}
