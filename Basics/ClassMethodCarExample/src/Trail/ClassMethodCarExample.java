package Trail;

public class ClassMethodCarExample {
	public void fullThrottle(){
		System.out.println("The Car is going as Fast as it Can");
	}
	public void speed(int x) {
		System.out.println("Speed: "+x);
	}

	public static void main(String[] args) {
		ClassMethodCarExample myCar = new ClassMethodCarExample();
		myCar.fullThrottle();
		myCar.speed(120);

	}

}
