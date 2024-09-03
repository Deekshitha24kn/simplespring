package simple_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester1 {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("simple_Spring/jsp.xml");
	context.getBean(JSpiders.class);
}
}
