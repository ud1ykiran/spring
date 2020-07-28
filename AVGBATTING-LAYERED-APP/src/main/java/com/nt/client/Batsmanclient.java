package com.nt.client;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.Batsmancontroller;
import com.nt.vo.Batsmanvo;

public class Batsmanclient {

	
     
	public static void main(String[] args) {
		DefaultListableBeanFactory factory =null;		 
	     XmlBeanDefinitionReader reader=null;
	     Batsmanvo vo=null;	 
	     Batsmancontroller controller=null;		 
	     String result=null;
	     
	Scanner scn = null;
	scn= new Scanner(System.in);	
	
	System.out.println("ENTER THE CRICKETER NAME::");
	String name=scn.next();
	
	System.out.println("ENTER THE RUN  HE DID::");
	String runs=scn.next();
	
	System.out.println("ENTER THE ININGS HE DID:: ");
	String inings=scn.next();
	
	System.out.println("ENTER THE NOT-OUTS OF CRIKETERS::");
	String notouts=scn.next();
	
	System.out.println("ENTER THE BALLS-FACED BY CRICKETER::");
	String ballsfaced=scn.next();
	
	System.out.println("ENTER THE RUNS-CONCEDED GIVEN BY CRICKETER::");
	String runsconceded=scn.next();
	
	System.out.println("ENTER THE WICKETS-TAKEN BY CRICKETER::");
	String wicketstaken=scn.next();
	
	System.out.println("ENTER THE BALLSBOWLED BY CRICKETER::");
	String ballsbowled=scn.next();
	
	 //create BeanFactory IOC COntainer
		
    factory=new DefaultListableBeanFactory();
    reader=new XmlBeanDefinitionReader(factory);
    reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
    
    //get controller Bean class object
    controller=factory.getBean("batscon",Batsmancontroller.class);
    
    // creating vo class object
	     vo=new Batsmanvo();
	     vo.setBallsbowled(ballsbowled);
	     vo.setBallsfaced(ballsfaced);
	     vo.setInings(inings);
	     vo.setName(name);
	     vo.setNotouts(notouts);
	     vo.setRuns(runs);
	     vo.setRunsconceded(runsconceded);
	     vo.setWicketstaken(wicketstaken);
	try {     
	    	 System.out.println();
	     result=controller.modify(vo);
	     System.out.println(result);
		
	}catch(Exception e) {
		
	   System.out.println("INTERNAL_PROBLEM::OOPS");
		e.printStackTrace();
	}
	}
}
