package com.jsmontesinos.kataprintdate;

import java.util.Date;

public class Printer implements IPrinter {

	public void print(Date date) {
		System.out.println(date);
	}

}
