package com.nt.dto;

import java.io.Serializable;

public class Employeedto  implements Serializable{
	
	
	
	private String empname;
	private String empcadar;
	
	
	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpcadar() {
		return empcadar;
	}

	public void setEmpcadar(String empcadar) {
		this.empcadar = empcadar;
	}

	private double basicsalary;

	public double getBasicsalary() {
		return basicsalary;
	}

	public void setBasicsalary(double basicsalary) {
		this.basicsalary = basicsalary;
	}

}
