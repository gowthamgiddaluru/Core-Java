package Trail;

public class ForLoop {

	public static void main(String[] args) {
		//increment loop
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("********");
		//decrement loop
		for(int i=10;i>=0;i--) {
			System.out.println(i);
		}
		System.out.println("********");
		//nested for loop
		for(int out=1; out <= 2; out++) {
			System.out.println("Outer Loop:" + out);
			for(int in=0; in<=2; in++) {
				System.out.println("Inner Loop:"+in);
			}
		}
		System.out.println("********");
		
		
		//break in for loop
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			if(i==4) {
				break;
			}
		}
		
		System.out.println("********");
		
		//continue in for loop
		for(int i=0;i<=10;i++) {
			if(i==4) {
				continue;
			}
			System.out.println(i);
		}
	}

}
