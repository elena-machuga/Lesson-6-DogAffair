package by.htp.puppy;

public class Dog extends Animal {
	
	private String breed;
	
	public void run() {
		System.out.println("Run!");
	}
	
	public void jump() {
		System.out.println("Jump!");
	}
	
	public void bark() {
		System.out.println("Woof woof!");
	}
	
	public void bite() {
		System.out.println("Arrr! My teeth are sharp!");
	}

	public Dog(String name, String breed) {
		super(name);
		this.breed = breed;
	}
	
	public Dog(String name) {
		super(name);
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Hi! My name is " + getName() + " and I am a " + breed + ".";
	}

}
