package Polymorphism;

public class Shape {
	public void area() {
		System.out.println("Cara mencari area: ");
	}
}

class Triangle extends Shape{
	public void area() {
		System.out.println("Cara mencari area Triangle");
	}
}

class Square extends Shape{
	public void area() {
		System.out.println("Cara mencari area Square");
	}
}

class Circle extends Shape{
	public void area() {
		System.out.println("Cara mencari area Circle");
	}
}