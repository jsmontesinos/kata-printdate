package com.jsmontesinos.kataprintdate;

import java.util.Date;

public class DaterDouble implements IDater{
	
	private Date currentDate;
	private boolean isCalled = false;

	public DaterDouble(Date currentDate){
		this.currentDate = currentDate;
	}

	public Date getCurrentDate() {
		isCalled = true;
		return currentDate;
	}

	public boolean isCalled() {
		return isCalled;
	}

}
