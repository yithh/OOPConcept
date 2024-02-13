package OverridingOverloading;

public class Main {

	public static void main(String[] args) {
		Overloading ol = new Overloading();
		
		ol.print();
		System.out.println("========================");
		ol.print(5);
		System.out.println("========================");
		ol.print("Yithro");
		System.out.println("========================");
		ol.print(false);
		
		RobotA rA = new RobotA();
		RobotB rB = new RobotB();
		
		rA.speak();
		rB.speak();
	}

}
