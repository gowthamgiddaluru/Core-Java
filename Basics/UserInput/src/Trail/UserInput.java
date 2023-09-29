package Trail;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String Value");
		String stringValue = sc.nextLine(); 
		System.out.println("String Value: " + stringValue);
		
		System.out.println("Enter Byte Value");
		byte byteValue = sc.nextByte(); 
		System.out.println("Byte Value: " + byteValue);
		
		System.out.println("Enter Short Value");
		short shortValue = sc.nextShort(); 
		System.out.println("Short Value: " + shortValue);
		
		System.out.println("Enter Int Value");
		int intValue = sc.nextInt(); 
		System.out.println("Int Value: " + intValue);
		
		
		System.out.println("Enter Long Value");
		long longValue = sc.nextLong(); 
		System.out.println("Long Value: " + longValue);
		
		System.out.println("Enter Float Value");
		float floatValue = sc.nextFloat(); 
		System.out.println("Float Value: " + floatValue);
		
		System.out.println("Enter Double Value");
		double doubleValue = sc.nextDouble(); 
		System.out.println("Double Value: " + doubleValue);
		
		System.out.println("Enter Char Value");
		char charValue = sc.next().charAt(1); 
		System.out.println("Char Value: " + charValue);
		
		System.out.println("Enter Boolean Value");
		boolean booleanValue = sc.nextBoolean(); 
		System.out.println("Boolean Value: " + booleanValue);
		sc.close();
	}

}
