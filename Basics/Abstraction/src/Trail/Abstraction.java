package Trail;

abstract class Animal{
	public abstract void animalSound();
	public void sleep() {
		System.out.println("Zzz");
	}
}


class Cat extends Animal{
	public void animalSound(){
		System.out.println("The Cat Says: Meow");
	}
}

class Dog extends Animal{
	public void animalSound(){
		System.out.println("The Dog Says: BOWW - BOWW");
	}
}


public class Abstraction {

	public static void main(String[] args) {
		
		Cat myCat = new Cat();
		Dog myDog = new Dog();
		myCat.animalSound();
		myCat.sleep();
		myDog.animalSound();
		myDog.sleep();
	}

}
