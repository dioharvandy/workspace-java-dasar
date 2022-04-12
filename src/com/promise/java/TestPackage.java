package com.promise.java;
import pewarisan.Binatang;
import pewarisan.Burung;
import pewarisan.KakakTua;

public class TestPackage {

	public static void main(String[] args) {
		Binatang binatangSatu = new Binatang();
		binatangSatu.setNama("Buck");
		binatangSatu.bersuara();
		
		System.out.println("");
		Burung burungSatu = new Burung();
		burungSatu.setNama("Pick");
		burungSatu.bersuara();
		burungSatu.bertelur();
		burungSatu.terbang();
		
		System.out.println("");
		KakakTua kakakTuaSatu = new KakakTua();
		kakakTuaSatu.setNama("kakak");
		kakakTuaSatu.bersuara();
		kakakTuaSatu.bersuara("'yuhuu'");
		kakakTuaSatu.bertelur();
		kakakTuaSatu.terbang();

	}

}
