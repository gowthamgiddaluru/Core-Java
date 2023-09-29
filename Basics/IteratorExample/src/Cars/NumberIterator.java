package Cars;
import java.util.ArrayList;
import java.util.Iterator;
public class NumberIterator {

	public static void main(String[] args) {
		ArrayList<Integer> Numbers = new ArrayList<Integer>();
		
		Numbers.add(0);
		Numbers.add(1);
		Numbers.add(2);
		Numbers.add(3);
		Numbers.add(4);
		Numbers.add(5);
		Numbers.add(6);
		Numbers.add(7);
		Numbers.add(8);
		Numbers.add(9);
		
		Iterator<Integer> it = Numbers.iterator();
		//looping with while loop
		while(it.hasNext()) {
			Integer i = it.next();
				if(i<5) {
					it.remove();
				}
		}
		System.out.println(Numbers);
	}
}
