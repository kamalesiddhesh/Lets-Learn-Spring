package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Test;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		Test t1 = (Test)ap.getBean("t");
//		Test t2 = (Test)ap.getBean("t");
		t1.hello("Siddhesh");
		t1.hello("Kiran");
//		System.out.println(t1==t2);
	}
}
