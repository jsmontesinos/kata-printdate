package com.jsmontesinos.kataprintdate;

public class PrintDate {
	
	Printer printer;
	Dater dater;
	
	public PrintDate(Printer printer, Dater dater) {
		super();
		this.printer = printer;
		this.dater = dater;
	}

	public void printCurrentDate() { 
		printer.printDate(dater.getCurrentDate()); 
	}

}
