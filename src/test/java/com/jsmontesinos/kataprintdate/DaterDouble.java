package com.jsmontesinos.kataprintdate;

import java.util.Date;

public class DaterDouble implements IDater{
	
	private Date currentDate;

	public DaterDouble(Date currentDate){
		this.currentDate = currentDate;
	}

	public Date getCurrentDate() {
		return currentDate;
	}

}
