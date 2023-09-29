package Trail;
import java.util.LinkedList;
public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> Cars = new LinkedList<String>();
		Cars.add("BMW");
		Cars.add("FORD");
		Cars.add("MAZDA");
		System.out.println(Cars);
		System.out.println("*******************");
		Cars.addFirst("AUDI");
		System.out.println(Cars);
		System.out.println("*******************");
		Cars.addLast("VOLVO");
		System.out.println(Cars);
		System.out.println("*******************");
		Cars.removeFirst();
		System.out.println(Cars);
		System.out.println("*******************");
		Cars.removeLast();
		System.out.println(Cars);
		System.out.println("*******************");
		System.out.println(Cars.getFirst());
		System.out.println("*******************");
		System.out.println(Cars.getLast());
		
	}

}
