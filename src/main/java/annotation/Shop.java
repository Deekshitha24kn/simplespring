package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import annotation_way.MyConfigClass;
@Component
public class Shop {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		context.getBean(IceCream.class).CheckIceCreamTaste();
	}
}
