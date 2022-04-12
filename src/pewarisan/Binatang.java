package pewarisan;

public class Binatang {
	private String nama;

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	public void bersuara() {
		System.out.println(getNama()+" Sedang Bersuara");
	}
	void tidur() {
		System.out.println(getNama()+" Sedang Tidur");
	}
}
