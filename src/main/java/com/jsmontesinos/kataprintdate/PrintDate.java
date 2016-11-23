package com.jsmontesinos.kataprintdate;

import java.util.Date;

public class PrintDate {
	
	Printer printer;
	
	public PrintDate(Printer printer) {
		super();
		this.printer = printer;
	}

	public void printCurrentDate() { 
		printer.printDate(getCurrentDate()); 
	}

	private Date getCurrentDate() {
		return new Date();
	}

}
