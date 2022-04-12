
public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			int result = 10/0;
			System.out.println(result);
		}
		catch(Exception e){
			System.out.println("Somethin Wrong");
		}
		finally {
			System.out.println("finished");
		}

	}

}
