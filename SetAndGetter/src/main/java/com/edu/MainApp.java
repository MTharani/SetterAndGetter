package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) 
	{
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
		Product p1=(Product) ctx.getBean("pob");
		p1.display();

	}

}
