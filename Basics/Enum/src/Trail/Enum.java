package Trail;

enum Level{
	LOW,
	MEDIUM,
	HIGH
}

public class Enum {
	public static void main(String[] args) {
		Level myVar = Level.MEDIUM;
		System.out.println(myVar);
		// enum in switch
		System.out.println("*****************");
		switch(myVar) {
		case LOW:{
			System.out.println("Level: " + myVar);
			break;
		}
		case MEDIUM:{
			System.out.println("Level: " + myVar);
			break;
		}
		case HIGH:{
			System.out.println("Level: " + myVar);
			break;
		}
		}
		System.out.println("*****************");
		// loop through enum
		
		for(Level Var : Level.values()) {
			System.out.println(Var);
		}
		
	}

}
