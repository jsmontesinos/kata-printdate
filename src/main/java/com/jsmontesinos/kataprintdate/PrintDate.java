package com.jsmontesinos.kataprintdate;

import java.util.Date;

public class PrintDate {
	
	public void printCurrentDate() { 
		System.out.println(getCurrentDate()); 
	}

	private Date getCurrentDate() {
		return new Date();
	}

}
