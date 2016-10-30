package com.jsmontesinos.kataprintdate;

public class PrintDate {
	
	IPrinter printer;
	IDater dater;
	
	public PrintDate(IPrinter printer, IDater dater){
		this.printer = printer;
		this.dater = dater;
	}
	
	public void printCurrentDate() { 
		printer.print(dater.getCurrentDate()); 
	}

}
