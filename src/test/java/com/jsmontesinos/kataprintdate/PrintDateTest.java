package com.jsmontesinos.kataprintdate;

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
	
		verify(printer).printDate(any(Date.class));;
	}
	
	@Test
	public void should_verify_print_expected_date(){
		Printer printer = mock(Printer.class);
		Dater dater = mock(Dater.class);
	}
}
