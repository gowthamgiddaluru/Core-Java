package Trail;

public class Polymorphism {
	public void sound() {
		System.out.println("This Animal Sounds");
	}
}
	
class Cat extends Polymorphism{
	public void sound() {
		System.out.println("Cat says Meow");
	}
}

class Dog extends Polymorphism{
	public void sound() {
		System.out.println("Dog says BOWW-BOWW");
	}
}

class Main{
	public static void main(String[] args) {
		Polymorphism myAnimal = new Polymorphism();
		Polymorphism myCat = new Cat();
		Polymorphism myDog = new Dog();
		
		myAnimal.sound();
		myCat.sound();
		myDog.sound();

	}

}
