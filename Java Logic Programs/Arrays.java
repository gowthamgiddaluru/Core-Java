package Trail;

public class Arrays {

	public static void main(String[] args) {
		String[] Cars = {"BMW","Benz","TATA","Mahindra","Jeep"};
		
		System.out.println(Cars[0]);
		System.out.println(Cars[0]="Mazda");
		System.out.println(Cars.length);
		System.out.println(Cars[0]);
		
		
		System.out.println("***************");
		
		//for loop through array
		
		for(int i=0;i<Cars.length;i++) {
			System.out.println(Cars[i]);
		}
		
		System.out.println("***************");
		
		//for each loop through array
		
		for(String i: Cars) {
			System.out.println(i);
		}
		

	}

}
