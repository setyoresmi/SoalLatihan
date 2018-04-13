package overrides;

public class Circle extends Ellipse{
	private double radius;
	
	public Circle(double radius) {
		super(radius, radius);
		this.radius=radius;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}
