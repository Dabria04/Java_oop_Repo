package JavaOOP;

public class MainClass {
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2.0, 3.0);
		System.out.println("Rectangle - Area: " + r.area());
		System.out.println("Rectangle - perimeter: " + r.perimeter());
		
		Circle c = new Circle(12.0);
		System.out.println("Circle - Area: " + c.area());
		System.out.println("Circle - perimeter: " + c.perimeter());
		
		Triangle tri = new Triangle(7, 12, 13);
		System.out.println("Triangle - Area: " + tri.area());
		System.out.println("Triangle- perimeter: " + tri.perimeter());
	}

}
