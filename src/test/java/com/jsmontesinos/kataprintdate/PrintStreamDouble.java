package com.jsmontesinos.kataprintdate;

import java.io.OutputStream;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class PrintStreamDouble extends PrintStream {

	String printedResult;
	
	public PrintStreamDouble(OutputStream out) {
		super(out);
		// TODO Auto-generated constructor stub
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
