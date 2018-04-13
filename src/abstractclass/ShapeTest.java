package abstractclass;

public class ShapeTest {
	public static void main(String[] args) {
		Shape[] shapes = {
				new Circle(10.0),
				new Rectangle(45.0,74.0),
				new Square(10.0)
		};
		System.out.println("Sum of area : "+ShapeUtils.sumArea(shapes));
	}
}
