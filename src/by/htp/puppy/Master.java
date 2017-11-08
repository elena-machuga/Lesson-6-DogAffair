package by.htp.puppy;

import java.util.ArrayList;
import java.util.List;

public class Master extends Person {

	private List<Dog> dogs;
	
	public Master(String name) {
		super(name);
		dogs = new ArrayList<>();
	}
	
	@Override
	public String toString() {
		String names = "";
		for (Dog d : dogs) {
			names = names + d.getName() + ", ";
		}
		return "My name is " + getName() + " and I have " + names;
	}

	public void feed(Dog dog) {
		System.out.println("Here is your meal, " + dog.getName() + ".");
		dog.jump();
		dog.eat();
	}

	public void walk(Dog dog) {
		System.out.println(dog.getName() + "! Let's go for a walk!");
		dog.jump();
		dog.run();
	}

	public void command(Dog dog) {
		System.out.println("Give me your voice!");
		dog.bark();
	}
	
	public void addDog(Dog dog) {
		dogs.add(dog);
		System.out.println("Come home, " + dog.getName() + ".");
	}

	

}
