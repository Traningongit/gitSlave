package com.example.demo;

import java.util.List;

public class HelloWorld {
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<Holiday> getHolidays() {
		return holidays;
	}
	public void setHolidays(List<Holiday> holidays) {
		this.holidays = holidays;
	}
	
	public void hello() {
		System.out.println("hello " + message);
	} 
	
	private String message;
	private List<Holiday> holidays;

}
