package Encapsulation;

import java.util.ArrayList;

public class Mahasiswa {
	protected String nama, nim;
	protected Integer umur;
	protected ArrayList<Integer> nilai = new ArrayList<>();
	
	public Mahasiswa(String nama, String nim, Integer umur, 
			ArrayList<Integer> nilai) {
		super();
		this.nama = nama;
		this.nim = nim;
		this.umur = umur;
		this.nilai = nilai;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public Integer getUmur() {
		return umur;
	}
	public void setUmur(Integer umur) {
		this.umur = umur;
	}
	public ArrayList<Integer> getNilai() {
		return new ArrayList<Integer>(nilai);
	}
	public void setNilai(ArrayList<Integer> nilai) {
		this.nilai = nilai;
	}
}
