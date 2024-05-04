package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class c =  Class.forName("beans.Test");
		// To get all Constructors of Class beans.Test
		Constructor con[] = c.getDeclaredConstructors();		
		//To Access private Constructors of Test class (Note:  here only private constructor is in Test class)
		con[0].setAccessible(true);
		//Creates an instance of private constructor
		con[0].newInstance(null);

	}

}
