package overrides;

public class Ellipse implements Shape{
	double a;
	double b;
	
	public Ellipse(double a,double b) {
		this.a=a;
		this.b=b;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14*a*b;
	}
}
