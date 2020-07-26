package com.nt.dto;

import java.io.Serializable;

public class Batsmandto implements Serializable {

	private String name;
	private int  runs;
	private int  inings;
	private int notouts;
	private int ballsfaced;
	private int runsconceded;
	private int wicketstaken;
	private int ballsbowled;
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getInings() {
		return inings;
	}
	public void setInings(int inings) {
		this.inings = inings;
	}
	public int getNotouts() {
		return notouts;
	}
	public void setNotouts(int notouts) {
		this.notouts = notouts;
	}
	public int getBallsfaced() {
		return ballsfaced;
	}
	public void setBallsfaced(int ballsfaced) {
		this.ballsfaced = ballsfaced;
	}
	
	
}
