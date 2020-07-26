package com.nt.controller;

import com.nt.dto.Batsmandto;
import com.nt.service.Batsmanserviceimpl;
import com.nt.vo.Batsmanvo;

public class Batsmancontroller {

	private Batsmanserviceimpl s;
	public Batsmancontroller(Batsmanserviceimpl s) {
		this.s=s;
	}
	
	public String modify(Batsmanvo vo) throws Exception {
		Batsmandto dto =null;
		String result=null;
		
		
		//creating dto class object
		dto=new Batsmandto();
		dto.setName(vo.getName());
		dto.setBallsbowled(Integer.parseInt(vo.getBallsbowled()));
		dto.setBallsfaced(Integer.parseInt(vo.getBallsfaced()));
		dto.setInings(Integer.parseInt(vo.getInings()));
		dto.setNotouts(Integer.parseInt(vo.getNotouts()));
		dto.setRuns(Integer.parseInt(vo.getRuns()));
		dto.setRunsconceded(Integer.parseInt(vo.getRunsconceded()));
		dto.setWicketstaken(Integer.parseInt(vo.getWicketstaken()));
	
		result=s.insert(dto);
		
		
		
		
		return result;
	}
	
}
