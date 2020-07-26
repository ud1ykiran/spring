package com.nt.bo;

public class Batsmanbo {
	
	private String name;
	private int  runs;
	private int inings;
	private int notouts;
	private int ballsfaced;
	private int runsconceded;
	private int wicketstaken;
	private int ballsbowled;
	
	
	private float avgbatting;
	private float battingstrikerate;
	private float avgblowing;
	private float blowingstrikerate;
	
	
	public int getRunsconceded() {
		return runsconceded;
	}
	public void setRunsconceded(int runsconceded) {
		this.runsconceded = runsconceded;
	}
	public int getWicketstaken() {
		return wicketstaken;
	}
	public void setWicketstaken(int wicketstaken) {
		this.wicketstaken = wicketstaken;
	}
	public int getBallsbowled() {
		return ballsbowled;
	}
	public void setBallsbowled(int ballsbowled) {
		this.ballsbowled = ballsbowled;
	}
	public float getAvgblowing() {
		return avgblowing;
	}
	public void setAvgblowing(float avgblowing) {
		this.avgblowing = avgblowing;
	}
	public float getBlowingstrikerate() {
		return blowingstrikerate;
	}
	public void setBlowingstrikerate(float blowingstrikerate) {
		this.blowingstrikerate = blowingstrikerate;
	}
	public float getAvgbatting() {
		return avgbatting;
	}
	public void setAvgbatting(float avgbatting) {
		this.avgbatting = avgbatting;
	}
	public float getBattingstrikerate() {
		return battingstrikerate;
	}
	public void setBattingstrikerate(float battingstrikerate) {
		this.battingstrikerate = battingstrikerate;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public void setInings(int inings) {
		this.inings = inings;
	}
	public void setNotouts(int notouts) {
		this.notouts = notouts;
	}
	public void setBallsfaced(int ballsfaced) {
		this.ballsfaced = ballsfaced;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
