package by.htp.puppy;

public class Puppy extends Dog {

	public Puppy(String name) {
		super(name);
		System.out.println("I was born!");
	}

	public Puppy(String name, String breed) {
		super(name, breed);
	}

	public void piss() {
		System.out.println("Pisssss... Oups!");
	}

	

}
