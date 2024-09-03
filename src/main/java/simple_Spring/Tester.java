package simple_Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Tester {
	public static void main(String[] args) {

//		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("simple_Spring/SpringConfiguration.xml"));
//		System.out.println(factory.getBean(Car.class));
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("simple_Spring/SpringConfiguration.xml");
//		context.getBean(Car.class);
		
//		constructor injection:
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("simple_Spring/abc.xml");
//		System.out.println(context.getBean(Bike.class));
		
//		Setter injection:
		
		ApplicationContext context = new ClassPathXmlApplicationContext("simple_Spring/abc.xml");
		System.out.println(context.getBean(Bus.class));
		
		

	}

}
