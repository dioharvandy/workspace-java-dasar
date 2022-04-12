package pewarisan;

public class Burung extends Binatang{
	public void bertelur() {
		System.out.println(getNama()+" Sedang Bertelur");
	}
	public void terbang() {
		System.out.println(getNama()+" Sedang Terbang");
	}
	protected void menukik() {
		System.out.println(getNama()+" Sedang Menukik");
	}
}

