package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.Employeebo;

public class Employeedaoimpl {

	private DataSource ds;
	private static final String EMPLOYEE="INSERT INTO EMP_SALARY VALUES(CUSTOMER.NEXTVAL,?,?,?,?,?)";
	
	
	public Employeedaoimpl(DataSource ds){
		this.ds=ds;
		
	}
	
	public int record(Employeebo bo) throws Exception {
	int count=0;
	
	Connection con =null;
	PreparedStatement ps=null;
	
	
		
		con=ds.getConnection();
		ps=con.prepareStatement(EMPLOYEE);
		ps.setString(1, bo.getEmpname());
		ps.setString(2, bo.getEmpcadar());
		ps.setDouble(3, bo.getBasicsalary());
		ps.setDouble(4, bo.getGrosssalary());
		ps.setDouble(5, bo.getNetsalary());
	    count=ps.executeUpdate();
	
		
		
		
		
		
		return count;
	}
}
