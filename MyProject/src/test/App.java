package test;

import beans.*;

public class App {
	public static void main(String[] args) {
		
		Car c = new Car();
		c.setEng(new PetrolEngine());
		c.drive();
		
	}

}
