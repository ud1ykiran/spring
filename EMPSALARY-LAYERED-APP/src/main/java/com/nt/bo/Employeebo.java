package com.nt.bo;

public class Employeebo {

	private String Empname;
	private String Empcadar;
	public String getEmpcadar() {
		return Empcadar;
	}
	public void setEmpcadar(String empcadar) {
		Empcadar = empcadar;
	}
	private double  basicsalary;
	private double  grosssalary;
	private double  netsalary;
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public double getBasicsalary() {
		return basicsalary;
	}
	public void setBasicsalary(double basicsalary) {
		this.basicsalary = basicsalary;
	}
	public double getGrosssalary() {
		return grosssalary;
	}
	public void setGrosssalary(double grosssalary) {
		this.grosssalary = grosssalary;
	}
	public double getNetsalary() {
		return netsalary;
	}
	public void setNetsalary(double netsalary) {
		this.netsalary = netsalary;
	}
}
