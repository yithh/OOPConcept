package OverridingOverloading;

public class Overloading {
	
	// run sesuai parameter
	public void print() {
		System.out.println("hello");
	}
	
	public void print(Integer num) {
		for (int i = 0; i < num; i++) {
			System.out.println("Hello " + (i+1));
		}
	}
	
	public void print(String nama) {
		System.out.println("Hello " + nama);
	}
	
	public void print(boolean x) {
		if (x==true) {
			System.out.println("Bener kok");
		}else{
			System.out.println("Walaweh");
		}
	}
}
