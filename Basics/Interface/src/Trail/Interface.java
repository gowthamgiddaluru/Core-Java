package Trail;

interface Animal{
	public void sound();
	public void sleep();
}

class Cat implements Animal{
	public void sound() {
		System.out.println("Cat says: Mewo");
	}
	public void sleep() {
		System.out.println("Zzz");
	}
}

class Dog implements Animal{
	public void sound() {
		System.out.println("Dog says: Boww- Boww");
	}
	public void sleep() {
		System.out.println("Zzz");
	}
}


public class Interface {

	public static void main(String[] args) {
		Cat myCat = new Cat();
		Dog myDog = new Dog();
		myCat.sound();
		myCat.sleep();
		myDog.sound();
		myDog.sleep();

	}

}
