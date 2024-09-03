package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component
public class IceCream {
	@Autowired
	@Qualifier("strawberry")
	Flavor flavor;
	
	public void CheckIceCreamTaste() {
		
		flavor.checkTaste();
	}
}
