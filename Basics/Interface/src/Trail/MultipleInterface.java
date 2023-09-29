package Trail;

interface FirstInterface{
	public void sound();
}

interface SecondInterface{
	public void sleep();
}

class DemoClass implements FirstInterface, SecondInterface{
	public void sound(){
		System.out.println("Animal makes Sound");
	}
	public void sleep(){
		System.out.println("Animal Sleeps Zzz");
	}
}
public class MultipleInterface {

	public static void main(String[] args) {
		DemoClass myDemo = new DemoClass();
		
		myDemo.sound();
		myDemo.sleep();

	}

}
