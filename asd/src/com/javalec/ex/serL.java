package com.javalec.ex;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class serL implements ServletContextListener {
@Override
public void contextDestroyed(ServletContextEvent sce) {
	// TODO Auto-generated method stub
System.out.println("context Destroyed");
}
@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
	System.out.println("contextInitialized");
	}
}
