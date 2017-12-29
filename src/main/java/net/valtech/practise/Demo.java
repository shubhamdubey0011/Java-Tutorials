package net.valtech.practise;

class Animal {
	void eat() {
		System.out.println("animal : eat");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println("dog : eat");
	}

	void anotherEat() {
//		super.eat();
		this.eat();
	}
}

public class Demo {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.eat();
		Dog d = new Dog();
		d.eat();
		d.anotherEat();

		Animal a1 = new Dog();
		a1.eat();

	}
}
