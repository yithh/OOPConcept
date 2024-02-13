package Inheritance;

public class Programmer extends Person{
	
	private String bahasa;
	
	public Programmer(String nama, Integer umur, String bahasa) {
		super(nama, umur);
		this.bahasa = bahasa;
	}
	
	public void coding() {
		System.out.println(super.nama + " sedang ngoding " + bahasa);
	}
	
}
