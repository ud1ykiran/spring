package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.Batsmanbo;

public class Batsmandaoimpl {

	private DataSource ds;
	
	private static final String BATTING= "INSERT INTO CRICKETER_BATTING VALUES(CUSTOMER.NEXTVAL,?,?,?,?,?)";
	
	public Batsmandaoimpl(DataSource ds) {
		this.ds=ds;
	}
	
	public int record(Batsmanbo bo) throws Exception {
		int count=0;
		Connection con=null;
		PreparedStatement ps =null;
		
		con=ds.getConnection();
		ps=con.prepareStatement(BATTING);
		ps.setString(1, bo.getName());
		ps.setFloat(2, bo.getAvgbatting());
		ps.setFloat(3, bo.getBattingstrikerate());
		ps.setFloat(4, bo.getAvgblowing());
		ps.setFloat(5, bo.getBlowingstrikerate());
		count =ps.executeUpdate();
		
		ps.close();
		con.close();
		
		return count;
	}
	
}
