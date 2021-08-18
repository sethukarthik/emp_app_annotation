package com.empappannotation.employee;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager extends Employee {
	
	private Project project;
	private BandLevel band = BandLevel.L5;

	public Manager() {
		System.out.println("Manager Default Constructor");
	}
	
	public Manager(Project project) {
		this.project = project;
	}
	
	public Manager(int id, String name, String email, String corpId, long phoneNumber, Salary salary, Project project) {
		super(id,name,email,corpId,phoneNumber,salary);
		this.project = project;
	}
	

	public Project getproject() {
		return this.project;
	}
	
	@Autowired
	public void setProject(Project project) {
		this.project = project;
	}

	public BandLevel getBand() {
		return band;
	}

	public void setBand(BandLevel band) {
		this.band = band;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(project);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		return Objects.equals(project, other.project);
	}

	@Override
	public String toString() {
		return "Manager [projectTitle=" + project + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getEmail()=" + getEmail() + ", getCorpId()=" + getCorpId() + ", getBand()=" + getBand()
				+ ", getPhoneNumber()=" + getPhoneNumber() + ", getSalary()=" + getSalary() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + "]";
	}
		
}