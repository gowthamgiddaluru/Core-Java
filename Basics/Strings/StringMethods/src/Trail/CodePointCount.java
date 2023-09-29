package Trail;

public class CodePointCount {

	public static void main(String[] args) {
		String s1 = "Hello World";
		int result = s1.codePointCount(0, 10); // gives how many unicodes in the string and need to mention the starting point and ending point
		System.out.println(result);

	}

}
