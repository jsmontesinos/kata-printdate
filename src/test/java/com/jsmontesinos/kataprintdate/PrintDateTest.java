package com.jsmontesinos.kataprintdate;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class PrintDateTest {
	
	@Test
	public void should_print_current_date_using_stub() {
		String strDate = "11/10/2010";
		
		PrinterDouble printer = new PrinterDouble();
		DaterDouble dater = new DaterDouble(parseSimpleDate(strDate));
		PrintDate printDate = new PrintDate(printer, dater);
		
		// Act
		printDate.printCurrentDate();
		
		// Assert
		assertEquals(printer.getPrintedResult(), strDate);
	}
	
	private Date parseSimpleDate(String strDate){
		Date date = null;
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date = df.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return date;
	}
	
	@Test
	public void should_print_current_date_using_mock() throws FileNotFoundException, ParseException{
		PrinterDouble printer = new PrinterDouble();
		DaterDouble dater = new DaterDouble(new Date());
		PrintDate printDate = new PrintDate(printer, dater);
		
		// Act
		printDate.printCurrentDate();
		
		// Assert
		assertTrue(dater.isCalled() && printer.isCalled());
	}
	
	
}
