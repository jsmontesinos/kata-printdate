package com.jsmontesinos.kataprintdate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrinterDouble implements IPrinter {

	String printedResult;

	public void print(Date date) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		this.printedResult = df.format(date);
	}

	public String getPrintedResult() {
		return printedResult;
	}	
}
