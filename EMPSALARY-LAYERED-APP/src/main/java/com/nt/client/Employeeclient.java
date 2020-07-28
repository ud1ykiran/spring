package com.nt.client;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.Employeecontroller;
import com.nt.vo.Employeevo;

public class Employeeclient {
	
	public static void main(String[] args) {
	Scanner scn =null;
	String result=null;
	DefaultListableBeanFactory factory =null;		 
    XmlBeanDefinitionReader reader=null;
    Employeecontroller controller=null;
    Employeevo vo =null;
	
	scn =new Scanner(System.in);
	
	System.out.println("ENTER THE EMPLOYEE NAME::");
	String empname=scn.next();
	
	System.out.println("ENTER THE EMPLOYEE CARDAR::");
	String empcadar=scn.next();
	
	System.out.println("ENTER THE EMPLOYEE BASIC SALARY::");
	String basicsalary=scn.next();
	
	 factory=new DefaultListableBeanFactory();
	    reader=new XmlBeanDefinitionReader(factory);
	    reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	    
	    controller=factory.getBean("ectrl",Employeecontroller.class);
		
	    vo=new Employeevo();
	    vo.setEmpname(empname);
	    vo.setEmpcadar(empcadar);
	    vo.setBasicsalary(basicsalary);
	    try {
	    result=controller.modify(vo);
	    System.out.println(result);
	    }catch(Exception e) {
		e.printStackTrace();
	}

}
}
