/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		Dog Clifford = new Dog();
		Dog Sigma = new Dog();
		
		System.out.println("Dog name ?");
		String x = sc.nextLine();
		
		Sigma.setName(x);
		
		System.out.println("What age should " + Sigma.getName() + " be");
		int y = sc.nextInt();
		Sigma.setAge(y);
		
		Sigma.setBreed("Dog dog");
		
		System.out.println(Sigma.getName() + " is a " + Sigma.getBreed() + 
		" that is " + Sigma.getAge() + " years old");
		
		System.out.println(Clifford.getName() + " is a " + Clifford.getBreed() + 
		" that is " + Clifford.getAge() + " years old");
		
		if(Sigma.isSleeping()){
			System.out.println(Sigma.getName() + " is sleeping. Don't wake him up");
		}
		else{
			System.out.println(Sigma.getName() + " is awake");
			Sigma.bark();
		}
		
		if((Sigma.isSleeping() && Clifford.isSleeping())){
			System.out.println(Clifford.getName() + " is sleeping as well");
		}
		
		else if(Clifford.isSleeping()){
			System.out.println(Clifford.getName() + " wakes up from hearing " + Sigma.getName());
			Clifford.bark();
		}
		
		else{
			System.out.println(Clifford.getName() + " isn't sleeping");
			
		}
		
		
		
		
		
		

	}
}
