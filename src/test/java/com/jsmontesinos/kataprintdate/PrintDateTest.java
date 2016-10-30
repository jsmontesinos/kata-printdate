package com.jsmontesinos.kataprintdate;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class PrintDateTest {
	
	@Test
	public void should_print_today_date() throws FileNotFoundException, ParseException{
		PrintStreamDouble ps = new PrintStreamDouble(new ByteArrayOutputStream());
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = "11/10/2010";
		PrintDate printer = new PrintDate(ps, df.parse(strDate));
		
		// Act
		printer.printCurrentDate();
		
		// Assert
		assertEquals(ps.getPrintedResult(), strDate);
	}
}
