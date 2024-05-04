package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		// It will check xml document
		// It will create instances for singleton beans
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		
		System.out.println("Spring.xml Document is  Valid......");
		ap.getBean("t");

	}

}
