package com.empappannotation.configuration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.empappannotation.employee.Salary;
import com.empappannotation.employee.SoftwareEngineer;
import com.empappannotation.employee.Manager;
import com.empappannotation.employee.Project;

public class WithOutDAO {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("without_dao.xml");
		
		Salary sal_1 = appContext.getBean("payScale", Salary.class);
		Salary sal_2 = appContext.getBean("payScale", Salary.class);
		Salary sal_3 = appContext.getBean("payScale", Salary.class);
		Project pro_1 = appContext.getBean(Project.class);
		
		//Create Project
		pro_1.setProjectName("Online Payment");
		pro_1.setLang("Java & Spring REST");
		
		//Create Manager
		Manager manager = appContext.getBean(Manager.class);
		Salary mSal = appContext.getBean("payScale", Salary.class);
		sal_1.setGrassPay(95000.36d);
		sal_1.setPf(3500.25d);
		manager.setId(2);
		manager.setName("Manager");
		manager.setEmail("manager@ra.com");
		manager.setCorpId("MANAGER123");
		manager.setSalary(mSal);
		manager.setPhoneNumber(9568457895l);
		manager.setProject(pro_1);
		System.err.println(manager);
		
		//Employee 1
		SoftwareEngineer sde = appContext.getBean(SoftwareEngineer.class);
		sal_2.setGrassPay(68000.36d);
		sal_2.setPf(2500.25d);
		sde.setId(1);
		sde.setName("EmployeeOne");
		sde.setEmail("emp_1@ra.com");
		sde.setCorpId("EMP1");
		sde.setPhoneNumber(9568457895l);
		sde.setSalary(sal_2);
		sde.setProject(pro_1);
		System.out.println(sde);
		
		//Employee 2 with Salary 3 object
		SoftwareEngineer sde_1 = appContext.getBean(SoftwareEngineer.class);
		sal_3.setGrassPay(65000.36d);
		sal_3.setPf(2500.25d);
		sde_1.setId(1);
		sde_1.setName("EmployeeTwo");
		sde_1.setEmail("emp_2@ra.com");
		sde_1.setCorpId("EMP2");
		sde_1.setPhoneNumber(9568457895l);
		sde_1.setSalary(sal_3);
		sde.setProject(pro_1);
		System.out.println(sde_1);
		
		appContext.close();
	}
}