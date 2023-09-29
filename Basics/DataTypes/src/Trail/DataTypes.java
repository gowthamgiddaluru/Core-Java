package Trail;

public class DataTypes {

	public static void main(String[] args) {
		//Primitive data types
		byte by = 120;
		short sh = 30000;
		int in = 100000;
		long lo = 2000000L;
		float fl = 9.99f;
		double dou = 9.9999d;
		char ch = 'A';
		boolean bo = true;
		
		//non-primitive data types
		String st = "Hello";
		String[] Cars = {"BMW", "Benz", "Volvo"}; // Array
		
		//print statements
		System.out.println("Byte: "+by);
		System.out.println("Short: "+sh);
		System.out.println("Int "+in);
		System.out.println("Long: "+lo);
		System.out.println("Float: "+fl);
		System.out.println("Double: "+dou);
		System.out.println("Char: "+ch);
		System.out.println("Boolean: "+bo);
		System.out.println("String: "+st);
		System.out.println("Cars: Array");
		for(String i: Cars) {
			System.out.println(i);
		}
	}

}
