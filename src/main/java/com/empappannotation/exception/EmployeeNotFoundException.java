package com.empappannotation.exception;

public class EmployeeNotFoundException extends Exception {
	
	public EmployeeNotFoundException(Object msg) {
		System.err.println(msg);
	}
	
}
