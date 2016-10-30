package com.jsmontesinos.kataprintdate;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class PrintDateTest {
	
	@Test
	public void should_print_today_date() throws FileNotFoundException, ParseException{
		PrinterDouble printer = new PrinterDouble();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = "11/10/2010";
		DaterDouble dater = new DaterDouble(df.parse(strDate));
		PrintDate printDate = new PrintDate(printer, dater);
		
		// Act
		printDate.printCurrentDate();
		
		// Assert
		assertEquals(printer.getPrintedResult(), strDate);
	}
}
