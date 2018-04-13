package abstractclass;

public class Square extends Shape {
	private double square_area;
	
	public Square(double square_area) {
		this.square_area=square_area;
	}
	
	public double getArea() {
		return square_area*square_area;
	}
}
