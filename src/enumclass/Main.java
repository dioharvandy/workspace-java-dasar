package enumclass;

public class Main {
	
	enum Level{low, medium, high}
	
	public static void printLevel(Level level) {
		switch(level) {
			case low:
				System.out.println("Output anda Rendah");
				break;
			case medium:
				System.out.println("Output anda Medium");
				break;
			case high:
				System.out.println("Output anda Tinggi");
				break;
		}
	}
	
	public static void main(String[] args) {
		Level myArgs = Level.high;
		printLevel(myArgs);
//		System.out.println(Level.low);
//		System.out.println(myArgs.medium);	
	}

}
