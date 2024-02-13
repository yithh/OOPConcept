package Inheritance;

public class Main {

	public static void main(String[] args) {
		Programmer pr = new Programmer("Yithro", 20, "Java");
		Dancer dc = new Dancer("Fio", 21, "apalah");
		pr.bicara();
		pr.coding();
		dc.bicara();
		dc.dance();
	}

}
