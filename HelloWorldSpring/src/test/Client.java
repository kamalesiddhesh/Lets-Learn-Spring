package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class Client{
	public static void main(String[] args){
		
		// Resource r = new ClassPathResource("resources/spring.xml")
		// BeanFactory factory = new XMLBeanFactory(r);
		// Object o = factory.getBean("t");
		// Test test = (Test)o;

		// Find XML
		Resource r = new ClassPathResource("resources/spring.xml");
		
		//Load XML into Container
        BeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader((BeanDefinitionRegistry) factory);
        xmlBeanDefinitionReader.loadBeanDefinitions(r);
		
		//Create Test Class Object 
        
		Object o1 = factory.getBean("t");
		Object o2 = factory.getBean("t");
		Object o3 = factory.getBean("t");
		
//		Test test = (Test)o;
//		test.hello();
		
//--------- When scope="singleton"----------------------------
//		System.out.println(o1==o2);
//		System.out.println(o2==o3);
//		System.out.println(o1==o3);
		
//----------When scope="prototype"-------------------------------
		System.out.println(o1==o2);
		System.out.println(o2==o3);
		System.out.println(o1==o3);
		
		
//--------Different References for Test Class Object-----
//		Object ot1 = factory.getBean("t1");
//		System.out.println("t and t1 are same : "+o1==ot1);
		
		
		
	}
}