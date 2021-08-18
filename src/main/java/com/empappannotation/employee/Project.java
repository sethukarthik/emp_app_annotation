package com.empappannotation.employee;

import org.springframework.stereotype.Component;

@Component
public class Project {
	
	private String projectName;
	private String lang;
	
	public Project() {
		System.out.println("Project Default Constructor");
	}
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	
}
