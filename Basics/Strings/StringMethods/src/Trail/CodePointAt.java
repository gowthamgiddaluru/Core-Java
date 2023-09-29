package Trail;

public class CodePointAt {

	public static void main(String[] args) {
		String s1 = "Hello";
		int result1 = s1.codePointAt(0); //gives unicode for the index
		System.out.println(result1);
		
		int result2 = s1.codePointAt(3); //gives unicode for the index
		System.out.println(result2);
		

	}

}
