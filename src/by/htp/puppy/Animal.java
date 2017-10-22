package by.htp.puppy;

public abstract class Animal {
	
	private String name;
	
	public void eat() {
		System.out.println("Am-am! So delicious!");
	}

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
