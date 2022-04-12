package statickeyword;

public class Main {
	private static String text;
	
	public Main(String text){
		this.text = text;
	}
	
	public void printText() {
		System.out.println("Selamat Data di MMI "+text);
	}
	public static void main(String[] args) {
		Main Myobj1 = new Main("Andi");
		Myobj1.printText();
		Main Myobj2 = new Main("Budi");
		Myobj2.printText();

	}

}
