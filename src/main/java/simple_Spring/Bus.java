package simple_Spring;

public class Bus {
	String name;
	 double prize;
	 String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Bus [name=" + name + ", prize=" + prize + ", color=" + color + "]";
	}
	 
}
