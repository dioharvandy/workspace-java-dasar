package com.promise.main;
import pewarisan.Burung;

public class Print extends Burung {

	public static void main(String[] args) {

		Burung burungSatu = new Burung();
		burungSatu.setNama("Kutilang");
		burungSatu.bersuara();
		burungSatu.bertelur();
		burungSatu.terbang();
		
		System.out.println("");
		Print burungDua = new Print();
		burungDua.setNama("Garuda");
		burungDua.menukik();
		
//		cara yang kurang efektif kalau menerapkan protected seperti ini
		System.out.println("");
		Garuda garuda = new Garuda();
		garuda.setNama("Brop");
		garuda.menukik();
	}

}
