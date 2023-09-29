package Trail;

class Inheritance {
	protected String brandName = "Ford";
	public void honk(){
		System.out.println("tuuth - tuuth");
	}
}
	
class Car extends Inheritance{
	private String modelName = "Mustang";
	public static void main(String[] args) {
			
        Car myCar = new Car();
		System.out.println(myCar.brandName);
		System.out.println(myCar.modelName);
		myCar.honk();	
		}
}
