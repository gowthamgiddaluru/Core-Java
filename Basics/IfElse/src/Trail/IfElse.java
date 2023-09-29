package Trail;
public class IfElse{
	public static void main(String[] args){
		int Time = 5;
		
		if(Time >=2 && Time <= 11) {
			System.out.println("Good Morning");
		}
		else if(Time >= 12 && Time < 16){
			System.out.println("Good Afternoon");
		}
		else if(Time >= 16 && Time <= 19){
			System.out.println("Good Evening");
		}
		else {
			System.out.println("Good Night");
		}
	}
}
