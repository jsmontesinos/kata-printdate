package com.jsmontesinos.kataprintdate;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class PrintStreamDouble extends PrintStream {

	String printedResult;

	public PrintStreamDouble(String arg0) throws FileNotFoundException {
		super(arg0);
		this.printedResult = arg0;
	}

	@Override
	public void println(Object x) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		this.printedResult = df.format(x);
	}

	public String getPrintedResult() {
		return printedResult;
	}	
}
