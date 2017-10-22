package by.htp.puppy;

public class AngryMan extends Person {

	public AngryMan(String name) {
		super(name);
	}

	public void beat(Puppy puppy) {		
		System.out.println("Get it!");
		puppy.bite();		
	}
	
	public void scream(Puppy puppy) {
		System.out.println("Get out of here!");
		puppy.piss();	
	}
	
}
