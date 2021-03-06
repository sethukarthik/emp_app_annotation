package com.empappannotation.employee;

import java.text.DecimalFormat;

import org.springframework.stereotype.Component;

@Component("payScale")
public class Salary {
	
	private double grassPay;
	private double pf;

	public Salary() {
		System.out.println("Salary default constructor");
	}

	public Salary(double grassPay, double pf) {
		super();
		this.grassPay = grassPay;
		this.pf = pf;
	}

	public double getGrassPay() {
		return grassPay;
	}

	public void setGrassPay(double grassPay) {
		this.grassPay = grassPay;
	}

	@Override
	public String toString() {
		return "Salary [grassPay=" + convertSalary("###.##", grassPay) + ", " + pf + "]";
	}
	
	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}
	
	public static String convertSalary(String patten, double grassPay) {
		DecimalFormat df = new DecimalFormat(patten);
		String op = df.format(grassPay);
		return op;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(grassPay);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Salary other = (Salary) obj;
		if (Double.doubleToLongBits(grassPay) != Double.doubleToLongBits(other.grassPay))
			return false;
		return true;
	}
	
}