package by.htp.puppy.runner;

import by.htp.puppy.AngryMan;
import by.htp.puppy.Dog;
import by.htp.puppy.Loveliness;
import by.htp.puppy.Master;
import by.htp.puppy.Puppy;

public class Main {

	public static void main(String[] args) {
		Master master = new Master("Vasilij");
		
		Dog poodle = new Puppy("Tuzik", "poodle", Loveliness.CUTE);
		System.out.println(poodle.toString());
		Dog cur = new Puppy("Uznaj", "cur", Loveliness.LOVELY);
		System.out.println(cur.toString());
		
		master.addDog(poodle);
		master.addDog(cur);
		
		System.out.println(master.toString());
		
		master.feed(cur);
		master.feed(poodle);
		
		master.walk(cur);
		master.walk(poodle);
		
		master.command(cur);
		
		AngryMan unnamed = new AngryMan("Incognto");
		unnamed.scream((Puppy) poodle);
		unnamed.beat((Puppy) poodle);
		
		

	}

}
