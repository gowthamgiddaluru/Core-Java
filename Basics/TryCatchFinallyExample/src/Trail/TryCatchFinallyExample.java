package Trail;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
	
		try {
			int[] Numbers = {0,1,2,3,4};
			System.out.println(Numbers[10]);
		}
		catch(Exception e) {
			System.out.println("Something Went Wrong");
		}
		finally {
			System.out.println("Finally block is Executed");
		}
	}
}
