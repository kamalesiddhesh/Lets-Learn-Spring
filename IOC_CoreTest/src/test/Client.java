package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		Resource r =  new ClassPathResource("resources/spring.xml");		
		
		BeanFactory factory =  new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((BeanDefinitionRegistry)factory);
		reader.loadBeanDefinitions(r);
		
		System.out.println("Spring.xml Document is  Valid......");
		
		factory.getBean("t");
		
		

	}

}
