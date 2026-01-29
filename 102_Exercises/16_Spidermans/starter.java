/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman a =  new Spiderman("Tobey Maguire", 48, "Green Goblin");
		Spiderman b =  new Spiderman("Andrew Garfield", 40, "Electro");
		Spiderman c = new Spiderman("Tom Holland", 27, "The Vulture");
		Spiderman d = new Spiderman();
		
		
		
		String name = a.getActor();
		System.out.println(name);
		
		int age = a.getAge();
		System.out.println(age);
		
		String villan = a.getVillan();
		System.out.println(villan);
		
		
		String name1 = b.getActor();
		System.out.println(name1);
		
		int age1 = b.getAge();
		System.out.println(age1);
		
		String villan1 = b.getVillan();
		System.out.println(villan1);
		
		
		String name2 = c.getActor();
		System.out.println(name2);
		
		int age2 = c.getAge();
		System.out.println(age2);
		
		String villan2 = c.getVillan();
		System.out.println(villan2);
		
		d.setAge(67);
		d.setActor("Miles Morales");
		d.setVillan("Kingpin");
		
		
		System.out.println(d.getActor());
		System.out.println(d.getAge());
		System.out.println(d.getVillan());
		
		
		
		
		
		
		
		
		
	}
}
