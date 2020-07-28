package com.nt.controller;

import com.nt.dto.Employeedto;
import com.nt.service.Managerserviceimpl;
import com.nt.vo.Employeevo;

public class Employeecontroller {
	
	private Managerserviceimpl ms;
	
	
	public   Employeecontroller(Managerserviceimpl ms) {
		this.ms=ms;
	}

	public String modify(Employeevo vo) throws Exception {
		Employeedto dto=null;
		
		dto=new Employeedto();
		dto.setEmpname(vo.getEmpname());
		dto.setEmpcadar(vo.getEmpcadar());
		dto.setBasicsalary(Double.parseDouble(vo.getBasicsalary()));
		
		String result=ms.insert(dto);
		
		return result;
	}
	
}
