package Trail;

public class ClassMethods {
	static void myMethod1() {
		System.out.println("Hello");
	}
	public void myMethod2() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		myMethod1();
		ClassMethods myObj = new ClassMethods();
		myObj.myMethod2();

	}

}
