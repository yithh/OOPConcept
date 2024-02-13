package Encapsulation;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> nilai = new ArrayList<>();
		nilai.add(87); //0
		nilai.add(90);
		nilai.add(92);
		nilai.add(89);
		
		Mahasiswa mhs = new Mahasiswa("Yithro", "2602112089", 20, nilai);
		
		ArrayList<Integer> nilai2 = mhs.getNilai();
		nilai2.remove(0);
		
		System.out.println("Nilai 1: " + mhs.getNilai());
		System.out.println("Nilai 2: " + nilai2);
	}

}
