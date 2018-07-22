package com.myjavablog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myjavablog.beans.Address;
import com.myjavablog.beans.Employee;

public class SetterMethodMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Employee beanInstance = (Employee) beanFactory.getBean("EmployeeBean");
		
		Address add = beanInstance.getAddress();
		System.out.println("Employee Name:" + beanInstance.getName() +" City: "+ add.getCity()  +" State: "+add.getState());
	}
}
