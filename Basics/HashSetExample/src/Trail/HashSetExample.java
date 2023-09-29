package Trail;
import java.util.HashSet;
public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> Cars = new HashSet<String>();
		
		Cars.add("BMW");
		Cars.add("VOLVO");
		Cars.add("MAZDA");
		Cars.add("BMW");
		Cars.add("TATA");

		System.out.println(Cars);
		System.out.println("**************************");
		Cars.remove("TATA");
		System.out.println(Cars);
		System.out.println("**************************");
		System.out.println(Cars.contains("BMW"));
		System.out.println("**************************");
		System.out.println(Cars.size());
		System.out.println("**************************");
		
		//looping with for each
		for(String s: Cars) {
			System.out.println(s);
		}
		System.out.println("**************************");
		
	}

}
