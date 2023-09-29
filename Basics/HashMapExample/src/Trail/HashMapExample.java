package Trail;
import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, String> Bikes = new HashMap<String, String>();
		Bikes.put("TVS","APACHE");
		Bikes.put("ROYAL ENFIELD","HIMALAYAN");
		Bikes.put("BMW","G310 GS");
		Bikes.put("BAJAJ","NS 200");
		
		System.out.println(Bikes);
		System.out.println("*********************");
		
		//looping key set with for each
		
		for(String i: Bikes.keySet()) {
			System.out.println(i);
		}
		System.out.println("*********************");
		
		//looping values set with for each
		
		for(String j: Bikes.values()) {
			System.out.println(j);
		}
		System.out.println("*********************");
		// looping both key-values
		
		for(String s: Bikes.keySet()) {
			System.out.println("This is a Key: " + s +", "+"This is a Value: " + Bikes.get(s));
		}
		
		
	}

}
