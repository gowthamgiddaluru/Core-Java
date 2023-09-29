package Trail;

public class CompareToIgnoreCase {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "hello";
		int result = s1.compareToIgnoreCase(s2);
		System.out.println(result);
		/*in this it will compare both the strings and ignores case
		 * and gives values like compare to()*/
	}

}
