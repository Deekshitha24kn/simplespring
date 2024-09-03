package annotation;

import org.springframework.stereotype.Component;

@Component
public class Chocolate implements Flavor{
    @Override
	public void checkTaste() {
		System.out.println("This is Choclate");
		
	}

}
