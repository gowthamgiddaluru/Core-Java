package Trail;

public class Constructors {
	
	String brand;
	String modelName;
	int year;
	
	public Constructors(){
		brand="Ford";
		modelName="Mustang";
		year=1997;
	}
	
	public Constructors(String s1, String s2, int y1){
		brand=s1;
		modelName=s2;
		year=y1;
	}
	
	
	public static void main(String[] args) {
		Constructors myCar1= new Constructors();
		System.out.println("Brand: " + myCar1.brand + ", Model Name: "+myCar1.modelName + ", Year: " + myCar1.year);
		System.out.println("***********************************************");
		Constructors myCar2= new Constructors("BMW","X1",2021);
		System.out.println("Brand: " + myCar2.brand + ", Model Name: "+myCar2.modelName + ", Year: " + myCar2.year);
		
	}

}
