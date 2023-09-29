package Trail;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<=10) {
			System.out.println(i);
			i+=2;
		}
		
		
		System.out.println("********");
		
		
		//break in while loop
		while(j<=10) {
			System.out.println(j);
			j++;
			if(j==4) {
				break;
			}
		}
		
		System.out.println("********");
		
		
		//continue in while loop
		while(k<=10) {
			if(k==4) {
				k++;
				continue;
			}
			System.out.println(k);
			k++;
			
		}
		
		
		
	}

}
