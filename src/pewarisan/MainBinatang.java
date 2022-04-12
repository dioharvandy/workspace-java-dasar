package pewarisan;

public class MainBinatang {
	
	public static void main(String[] args) {
		Binatang binatangSatu = new Binatang();
		binatangSatu.setNama("Buck");
		binatangSatu.bersuara();
		makan();
		
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
		kakakTuaSatu.tidur();


	}
	private static void makan() {
		System.out.println("Binatang ini Sedang makan");
	}

}
