package OverridingOverloading;

public class Robot {
	public void speak() {
		System.out.println("Hello, I'm the new Assistant");
	}
}

class RobotA extends Robot{
	public void speak() {
		System.out.println("I'm robot A ready to mop the floor");
	}
}

class RobotB extends Robot{
	public void speak() {
		System.out.println("I'm robot B ready to drive you to school");
	}
}