package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Client {

	public static void main(String[] args) {
		
		String[] xmlFileArray ={"resources/car.xml","resources/engine.xml"};
		
		ApplicationContext ap = new ClassPathXmlApplicationContext(xmlFileArray);
		Car mycar= (Car)ap.getBean("c");
		mycar.printCarData();

	}

}
