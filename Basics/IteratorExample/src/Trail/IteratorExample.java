package Trail;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<String> Cars = new ArrayList<String>();
		
		Cars.add("BMW");
		Cars.add("FORD");
		Cars.add("MAZDA");
		Cars.add("NISSAN");
		
		Iterator<String> it = Cars.iterator();
		
		//System.out.println(it.next());
		
		
		//looping through iterator
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
