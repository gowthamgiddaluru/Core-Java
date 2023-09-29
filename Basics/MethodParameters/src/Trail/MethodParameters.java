package Trail;

public class MethodParameters {

	static void myMethod1(String fName, int age){
		
		String FirstName = fName;
		int Age = age;
		System.out.println("FirstName: "+FirstName+", Age: "+Age);
	}
	
	static int myMethod2(int x, int y){
		return x+y;
		
	}
	
	static void checkVoteAge(int age){
		if(age>=18) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("You are not eligible to vote");
		}
	}
	
	public static void main(String[] args) {
		
		myMethod1("Gowtham", 26);
		System.out.println("*********************");
		int z= myMethod2(2, 3);
		System.out.println(z);
		System.out.println("*********************");
		checkVoteAge(26);
		System.out.println("*********************");
		checkVoteAge(14);
		
	}

}
