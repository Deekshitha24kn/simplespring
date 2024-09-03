package annotation_way;

import org.springframework.stereotype.Component;

@Component
public class MrfTyre implements Tyre {
	@Override
	public void checkAir() {
		System.out.println("air is 80%");
	}
}
