package com.jsmontesinos.kataprintdate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;
import org.mockito.Mockito;

public class PrintDateTest {
	
	@Test
	public void should_print_current_date_using_stub() {
		String strDate = "11/10/2010";
		
		PrinterDouble printer = new PrinterDouble();
		DaterDouble dater = new DaterDouble(getSimpleDate(11,10,2010));
		PrintDate printDate = new PrintDate(printer, dater);
		
		// Act
		printDate.printCurrentDate();
		
		// Assert
		assertEquals(printer.getPrintedResult(), strDate);
	}
	
	private Date getSimpleDate(int day, int month, int year){
		Calendar cal = new GregorianCalendar(year, month - 1, day);
		
		return cal.getTime();
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
	
	@Test
	public void should_print_current_date_using_mockito_stub(){
		PrinterDouble printerDouble = new PrinterDouble();
		IDater daterMock = Mockito.mock(IDater.class);
		String strDate = "11/10/2010";
		Mockito.when(daterMock.getCurrentDate()).thenReturn(getSimpleDate(11,10,2010));
		
		PrintDate printDate = new PrintDate(printerDouble, daterMock);
		
		// Act
		printDate.printCurrentDate();
		
		// Assert
		assertEquals(printerDouble.getPrintedResult(), strDate);
		
	}
	
	@Test
	public void should_print_current_date_using_mockito_mock(){
		String strDate = "11/10/2010";
		Date date = getSimpleDate(11,10,2010);
		IPrinter printerMock = Mockito.mock(IPrinter.class);
		IDater daterMock = Mockito.mock(IDater.class);
		Mockito.when(daterMock.getCurrentDate()).thenReturn(date);
		
		PrintDate printDate = new PrintDate(printerMock, daterMock);
		
		// Act
		printDate.printCurrentDate();
		
		// Assert
		Mockito.verify(printerMock).print(date);
		
	}
	
	
}
