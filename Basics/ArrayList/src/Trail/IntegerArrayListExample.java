package Trail;
import java.util.ArrayList;
import java.util.Collections;
public class IntegerArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> Numbers = new ArrayList<Integer>();
		
		
		Numbers.add(5);
		Numbers.add(8);
		Numbers.add(2);
		Numbers.add(1);
		Numbers.add(4);
		Numbers.add(6);
		Numbers.add(9);
		Numbers.add(0);
		Numbers.add(3);
		Numbers.add(7);
		
		int size = Numbers.size();
		for(int i = 0; i < size; i++) {
			System.out.println(Numbers.get(i));
		}
		System.out.println("**************");
		Collections.sort(Numbers);
		
		for(int i: Numbers) {
			System.out.println(i);
		}

		
	}

}
