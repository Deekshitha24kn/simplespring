package annotation_way;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShowRoom {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(MyConfigClass.class);
	context.getBean(Car.class).CheckTyreAir();
}
}
