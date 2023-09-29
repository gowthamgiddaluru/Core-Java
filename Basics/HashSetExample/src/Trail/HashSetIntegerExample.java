package Trail;
import java.util.HashSet;
public class HashSetIntegerExample {

	public static void main(String[] args) {
		HashSet<Integer> Numbers = new HashSet<Integer>();
		
		Numbers.add(4);
		Numbers.add(8);
		Numbers.add(3);
		Numbers.add(1);
		
		//looping to check what values are in set and what values are not in set
		
		for(int i=0; i<=10; i++) {
			if(Numbers.contains(i)) {
				System.out.println(i+" Found in This Set");
			}
			else {
				System.out.println(i+" Not Found in This Set");
			}
		}
		
	}

}
