package Trail;

public class CodePointBefore {

	public static void main(String[] args) {
		
		String s1 = "Apple";
		int result = s1.codePointBefore(1);//gives unicode to the before element of the index
		System.out.println(result);
	}

}
