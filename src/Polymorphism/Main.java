package Polymorphism;

public class Main {

	public static void main(String[] args) {
		Shape shape = new Shape();
		Shape triangle = new Triangle();
		Shape circle = new Circle();
		Shape square = new Square();
		
		shape.area();
		triangle.area();
		square.area();
		circle.area();

	}

}
