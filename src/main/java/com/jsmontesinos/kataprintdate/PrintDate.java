package com.jsmontesinos.kataprintdate;

import java.util.Date;

public class PrintDate {
	
	public void printCurrentDate() { 
		printDate(getCurrentDate()); 
	}

	private void printDate(Date date) {
		System.out.println(date);
	}

	private Date getCurrentDate() {
		return new Date();
	}

}
