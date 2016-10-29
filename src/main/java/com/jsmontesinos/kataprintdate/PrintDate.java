package com.jsmontesinos.kataprintdate;

import java.io.PrintStream;
import java.util.Date;

public class PrintDate {
	
	PrintStream out;
	Date date;
	
	public PrintDate(){
		this.out = System.out;
		this.date = new Date();
	}
	
	public PrintDate(PrintStream out, Date date){
		this.out = out;
		this.date = date;
	}
	
	public void printCurrentDate() { 
		out.println(date); 
	}

}
