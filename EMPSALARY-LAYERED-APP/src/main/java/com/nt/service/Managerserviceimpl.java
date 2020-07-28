package com.nt.service;

import com.nt.bo.Employeebo;
import com.nt.dao.Employeedaoimpl;
import com.nt.dto.Employeedto;

public class Managerserviceimpl implements Employeeservice{
	private Employeedaoimpl dao;
	
	public Managerserviceimpl(Employeedaoimpl dao) {
		this.dao=dao;
	}
	
	public String insert(Employeedto dto) throws Exception{
		int count=0;
		double basic=0;
		double grosssalary=0;
		double netsalary=0;
        Employeebo bo=null;
        
		basic=dto.getBasicsalary();
		grosssalary=basic+(basic*95/100)+(basic*25/100);
		netsalary=basic+(basic*20/100)+(basic*95/100)+3000;
		
		//creating employeebo class object
           
		bo=new Employeebo();
		bo.setEmpname(dto.getEmpname());
		bo.setEmpcadar(dto.getEmpcadar());
		bo.setBasicsalary(basic);
		bo.setGrosssalary(grosssalary);
		bo.setNetsalary(netsalary);
		
		//calling dao class recorrd(-)
		
	       count = dao.record(bo);	
		
		return count==0?"EMPLOYEE RECORDS FAILED TO INSERT>>>>>>>SORRY...........!!!!":"EMPLOYEE RECORD SUCESSFULLY INSERTED"+"\n"+"BASIC SALARY::-------"+basic+"\n"+"GROSS-SALARY::-------"+grosssalary
				+"\n"+"NET-SALARY::---------"+netsalary;
	}

}
