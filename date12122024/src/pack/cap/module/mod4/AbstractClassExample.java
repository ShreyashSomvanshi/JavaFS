package pack.cap.module.mod4;

class Circle extends AbstractClass_Shape{
	double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
}

class Rectangle extends AbstractClass_Shape{
	double length, width;
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double area() {
		return length * width;
	}
	
	@Override
	public double perimeter() {
		return 2*(length+width);
	}
	
}


public class AbstractClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass_Shape circle = new Circle(5);
		System.out.println("Area = " + circle.area());
		System.out.println("Perimeter = " + circle.perimeter());
		
		AbstractClass_Shape rect = new Rectangle(4,6);
		System.out.println("Rect Area = " + rect.area());
		System.out.println("Rect Perimeter = " + rect.perimeter());
	}
	
}
