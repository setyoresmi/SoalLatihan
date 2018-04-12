package collections;

public class Circle {
	private double radius;
	private double area;
	private static double PHI = 3.14;
	
	public Circle(double radius){
		super();
		this.radius=radius;
	}
	
	public double getArea() {
		area = 2 * PHI * radius;
		return area;
	}
	
}
