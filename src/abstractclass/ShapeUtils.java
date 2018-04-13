package abstractclass;

public class ShapeUtils {
	public static double sumArea(Shape[] shapes) {
		double sum = 0;
		for (Shape shape : shapes) {
			sum+=shape.getArea();	
		}
		return sum;
	}
}
