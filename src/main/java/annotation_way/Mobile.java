package annotation_way;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope("prototype")
public class Mobile {
	String name;
	String color;
	public String getName() {
		return name;
	}
	@Value("redmi")
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	@Value("Black")
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", color=" + color + "]";
	}
	

}
