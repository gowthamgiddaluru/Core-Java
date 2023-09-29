package Trail;

public class ClassesAndObjects {
	String firstName = "Gowtham";
	String lastName = "G";
	int age = 25;
	long mobileNumber = 7893307172L;

	public static void main(String[] args) {
		ClassesAndObjects myObj = new ClassesAndObjects();
		ClassesAndObjects myObj2 = new ClassesAndObjects();
		System.out.println("Before Changing the Values:");
		System.out.println("First Name: "+myObj.firstName+" Last Name: "+myObj.lastName);
		System.out.println("Age: "+myObj.age+" Mobile Number: "+myObj.mobileNumber);
		
		myObj.firstName = "GOWTHAM";
		myObj.lastName = "GIDDALURU";
		myObj.age = 25;
		myObj.mobileNumber = 9908717997L; 
		
		System.out.println("After Changing the Values:");
		System.out.println("First Name: "+myObj.firstName+" Last Name: "+myObj.lastName);
		System.out.println("Age: "+myObj.age+" Mobile Number: "+myObj.mobileNumber);
		
		System.out.println("*******************************");
		System.out.println("First Name: "+myObj2.firstName+" Last Name: "+myObj2.lastName);
		System.out.println("Age: "+myObj2.age+" Mobile Number: "+myObj2.mobileNumber);

	}

}
