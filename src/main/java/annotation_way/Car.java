package annotation_way;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	@Qualifier("ceatTyre")
	Tyre tyre;
	
	public void CheckTyreAir() {
		
		tyre.checkAir();
	}
}
