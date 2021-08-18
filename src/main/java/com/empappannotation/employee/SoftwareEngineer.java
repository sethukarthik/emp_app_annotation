package com.empappannotation.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer extends Employee {
	
	private BandLevel band;
	private Project project;
	
	public SoftwareEngineer() {
		System.out.println("SoftwareEngineer Default Constructor");
	}
	
	public SoftwareEngineer(String band) {
		this.band = BandLevel.L3;
	}

	public BandLevel getBand() {
		return band;
	}

	public void setBand(BandLevel band) {
		this.band = band;
	}
	
	public Project getproject() {
		return this.project;
	}
	
	@Autowired
	public void setProject(Project project) {
		this.project = project;
	}
}
