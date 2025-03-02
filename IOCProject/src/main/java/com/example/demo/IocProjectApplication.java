package com.example.demo;

import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class IocProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(IocProjectApplication.class, args);
		
		System.out.println("Hello Suman");
		
		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld helloWorld = (HelloWorld) container.getBean("helloWorld");
		List<Holiday> holidays = helloWorld.getHolidays();
		for (Iterator iterator = holidays.iterator(); iterator.hasNext();) {
			Holiday holiday = (Holiday) iterator.next();
			//holiday.getGreeting();
			System.out.println(holiday.getGreeting());
		}
		
		//helloWorld.hello();
	}

}
