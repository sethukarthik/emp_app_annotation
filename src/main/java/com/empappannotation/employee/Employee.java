package com.empappannotation.employee;

import javax.inject.Named; //This is JEE Annotation

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired; -> This is spring Annotation
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int id;
	private String name;
	private String email;
	private String corpId;
	
	private long phoneNumber;
	private Salary salary;
	
	public Employee() {
		System.out.println("Default Employee Constructor");
	}

	public Employee(int id, String name, String email, String corpId, long phoneNumber) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.corpId = corpId;
		this.phoneNumber = phoneNumber;
	}
	
	public Employee(String name, String email, String corpId, long phoneNumber) {
//		this.id = id;
		this.name = name;
		this.email = email;
		this.corpId = corpId;
		this.phoneNumber = phoneNumber;
	}
	
	public Employee(int id, String name, String email, String corpId, long phoneNumber, Salary salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.corpId = corpId;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCorpId() {
		return corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Salary getSalary() {
		return salary;
	}

	@Autowired
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", corpId=" + corpId + ", phoneNumber=" + phoneNumber + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((corpId == null) ? 0 : corpId.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (corpId != null) {
			if(other.corpId != null)
				return false;
		} else if (!corpId.equals(other.corpId))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		return true;
	}
}