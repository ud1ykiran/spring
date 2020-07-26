package com.nt.service;

import com.nt.bo.Batsmanbo;
import com.nt.dao.Batsmandaoimpl;
import com.nt.dto.Batsmandto;

public class Batsmanserviceimpl implements Batsmanservice{
     
	
	private Batsmandaoimpl dao;
	

    public Batsmanserviceimpl(Batsmandaoimpl dao) {
		this.dao=dao;
	}
	
	
    
    @Override
	public String insert(Batsmandto dto) throws Exception {
    float avgbatting=0.0f;		
	float avgblowing=0.0f;
	float battingstrikerate=0.0f;
	float blowingstrikerate=0.0f;
	Batsmanbo bo =null;
	int count=0;
	avgbatting=(dto.getRuns())/(dto.getInings()-dto.getNotouts());
	
	avgblowing=dto.getRunsconceded()/dto.getWicketstaken();
	
	battingstrikerate=(dto.getRuns()/dto.getBallsfaced())*100;
	
	blowingstrikerate=dto.getBallsbowled()/dto.getWicketstaken();
	
	//creating bo object--------------->
	
     bo=new Batsmanbo();
     bo.setName(dto.getName());
     bo.setAvgbatting(avgbatting);
     bo.setAvgblowing(avgblowing);
     bo.setBattingstrikerate(battingstrikerate);
     bo.setBlowingstrikerate(blowingstrikerate);
	
     //creating dao object---------------->
     
    count =dao.record(bo);  
		System.out.println();
		
		return count==0?"RECORD INSERTION FAILED":"RECORD INSERTED ------->NAME::"+dto.getName()+"\n"+"AVG-BATTING::"+avgbatting+"\n"+"AV-GBLOWING::"+avgblowing+"\n"+"BATTING-STRIKE-RATE::"+battingstrikerate+"\n"+"BLOWING-STRIKE-TRATE::"+blowingstrikerate;
	}
}
