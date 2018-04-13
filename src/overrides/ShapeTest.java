package overrides;

public class ShapeTest {
	public static void main(String[] args) {
		Shape[] shapes = {
				new Circle(14.0),
				new Ellipse(3.4,7.0)
		};
		System.out.println("Sum area : "+ShapeUtils.sumArea(shapes));
	}
}
