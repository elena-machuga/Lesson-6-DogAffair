package by.htp.puppy;

public class Puppy extends Dog {
	
	private Loveliness lovely;

	public Puppy(String name) {
		super(name);
		System.out.println("I was born!");
	}

	public Puppy(String name, String breed, Loveliness lovely) {
		super(name, breed);
		this.lovely = lovely;
		System.out.println("I was born!");
	}
	
	@Override
	public String toString() {
		return "Hi! My name is " + getName() + " and I am a " + getBreed() + ". I am so " + lovely + "!";
	}

	public void piss() {
		System.out.println("Pisssss... Oups!");
	}

	

}
