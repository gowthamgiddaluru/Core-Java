package Trail;

public class MultidimensionalArrays {

	public static void main(String[] args) {
		int[][] myNumbers = {{1,2,3,4},{5,6,7}};
		
		System.out.println(myNumbers[0][3]);
		
		System.out.println("***********");
		
		// replacing value
		myNumbers[1][2] = 9;
		System.out.println(myNumbers[1][2]);// now 9 will display instead of 7
		
		
		System.out.println("***********");
		
		//loop through multidimensional array
		
		for(int i=0; i < myNumbers.length; i++) {
			for(int j=0; j < myNumbers[i].length; j++) {
				System.out.println(myNumbers[i][j]);
				
			}
		}

	}

}
