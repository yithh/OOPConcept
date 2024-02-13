package Inheritance;

public class Person {
	protected String nama;
	protected Integer umur;
	
	public Person(String nama, Integer umur) {
		this.nama = nama;
		this.umur = umur;
	}
	
	public void bicara() {
		System.out.println("Halo, saya " + nama + " umurnya " + umur);
	}
}
