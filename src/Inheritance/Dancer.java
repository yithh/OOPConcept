package Inheritance;

public class Dancer extends Person {
	
	String group;
	
	public Dancer(String nama, Integer umur, String group) {
		super(nama, umur);
		this.group = group;
	}
	
	public void dance() {
		System.out.println(super.nama + " sedang dance bareng " + group);
	}
}
