package Trail;

public class MethodOverloading {
	
	static int plusMethod(int x,int y ) {
		return x+y;
	}
	
	static int method(int x,int y, int z ) {
		return x+y+z;
	}
	
	static double plusMethod(double x,double y ) {
		return x+y;
	}
	
	public static void main(String[] args) {
		int x=plusMethod(2,3);
		double d=plusMethod(6.5d, 7.5d);
		
		System.out.println("x value: "+x);
		System.out.println("d Value: "+d);
		System.out.println(method(1,2,3));

	}

}
