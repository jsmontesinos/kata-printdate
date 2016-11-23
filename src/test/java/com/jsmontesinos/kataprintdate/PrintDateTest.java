package com.jsmontesinos.kataprintdate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class PrintDateTest {
	
	@Test
	public void should_print_current_date(){
		PrintDate printDate = new PrintDate(new Printer(), new Dater());
		
		printDate.printCurrentDate();
		
		// How to assert printed date is correct?
	}
	
	@Test
	public void should_verify_print_call(){
		Printer printer = mock(Printer.class);
		PrintDate printDate = new PrintDate(printer, new Dater());
		
		printDate.printCurrentDate();
	
		verify(printer).printDate(any(Date.class));
	}
	
	@Test
	public void should_verify_print_expected_date() throws ParseException{
		Printer printer = mock(Printer.class);
		Dater dater = mock(Dater.class);
		Date fixDate = (new SimpleDateFormat("dd/MM/yyyy")).parse("01/01/2011");
		when(dater.getCurrentDate()).thenReturn(fixDate);
		PrintDate printDate = new PrintDate(printer, dater);
		
		printDate.printCurrentDate();
		
		verify(printer).printDate(fixDate);
	}
}
