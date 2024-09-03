package annotation_way;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyMainClass {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(MyConfigClass.class);
	System.out.println(context.getBean("mobile"));
	System.out.println(context.getBean("mobile"));
	
}
}
