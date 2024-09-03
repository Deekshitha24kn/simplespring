package simple_Spring;

public class Bike {
 String name;
 double prize;
 String color;
public Bike(String name, double prize, String color) {
	super();
	this.name = name;
	this.prize = prize;
	this.color = color;
}
@Override
public String toString() {
	return "Bike [name=" + name + ", prize=" + prize + ", color=" + color + "]";
}
 
}
