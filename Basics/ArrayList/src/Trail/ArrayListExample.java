package Trail;
import java.util.ArrayList;
import java.util.Collections;
class ArrayListExample{
	public static void main(String[] args) {
		ArrayList<String> Cars= new ArrayList<String>();
		
		//adding elements
		Cars.add("BMW");
		Cars.add("FORD");
		Cars.add("MAZDA");
		Cars.add("BENZ");
		//accessing elements
		System.out.println(Cars.get(0));
		System.out.println(Cars.get(1));
		System.out.println(Cars.get(2));
		System.out.println(Cars.get(3));
		System.out.println("*******************");
		//changing an element
		Cars.set(0, "AUDI");
		System.out.println(Cars.get(0));
		System.out.println("*******************");
		//size of an array list
		int size= Cars.size();
		System.out.println(size);
		//removing an element
		Cars.remove(0);
		System.out.println(Cars.get(0));
		int size2 =Cars.size();
		System.out.println(size2);
		System.out.println("*******************");
		//looping through array list
		Collections.sort(Cars);
		for(int i=0;i < Cars.size();i++) {
			System.out.println(Cars.get(i));
		}
		System.out.println("*******************");
		//looping with for each
		for(String j: Cars) {
			System.out.println(j);
		}
		
		
	}
}
