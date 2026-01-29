/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name ? ");
		String name = sc.nextLine();
		System.out.println("What is your title");
		String title = sc.nextLine();
	System.out.println("Would you like to be a Wizard, Warrior, or Rogue? ");
	String answer = sc.nextLine();
	if(answer.equals("Wizard")||answer.equals("wizard")){
	System.out.println("You've chosen the Wizard! Excelsior!");
	}
	else if(answer.equals("Warrior")||answer.equals("warrior")){
	System.out.println("You've chosen the Warrior! For honor!");
	}
	else if(answer.equals("Rogue")||answer.equals("rogue")){
 System.out.println("You've chosen the Rogue! How cunning!");
	}
	else{
	System.out.println("You've decided not to chose a role. Rerun program.");
	}
	System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
	System.out.println("Strength (1-10): ");
	int num = 20;
	
	int strengthpoints = sc.nextInt();
	
	if(strengthpoints > 10){
	System.out.println("Please input a smaller number");
	System.out.println("Strength (1-10):");
	strengthpoints = sc.nextInt();
	}
	
	num = num - strengthpoints;
	System.out.println("You have "+ " " + (num) + " " + "left to spend");
	
	System.out.println("Dexterity (1-10): ");

	int dexterpoints = sc.nextInt();
	
	if(dexterpoints > 10){
	System.out.println("Please input a smaller number");
	System.out.println("Dexterity (1-10):");
	dexterpoints = sc.nextInt();
	}
	num = num - dexterpoints;
	System.out.println("You have "+ " " + (num) + " " + "left to spend");
	
	System.out.println("Intelligence (1-10):");
	int Intelligencepoints = sc.nextInt();
	if(Intelligencepoints > 10){
	System.out.println("Please input a smaller number");
	System.out.println("Intelligence (1-10):");
	Intelligencepoints = sc.nextInt();
	}
	num = num - Intelligencepoints;
	System.out.println("You have "+ " " + (num) + " " + "left to spend");
	
	System.out.println("Charisma (1-10):");
	int Charismapoints = sc.nextInt();
	if(Charismapoints > 10){
	System.out.println("Please input a smaller number");
	System.out.println("Charisma (1-10):");
	Charismapoints = sc.nextInt();
	}
	
	num = num - Charismapoints;
	System.out.println("You have "+ " " + (num) + " " + "left to spend");
	System.out.println("--------------------------------------------------");
	System.out.println("You are " + name + " the " + title + " of Cvhs");
	System.out.println("Strength - " + strengthpoints);
	System.out.println("Dexterity - " + dexterpoints);
	System.out.println("Intelligence - " + Intelligencepoints);
	System.out.println("Charisma - " + Charismapoints);
	}
}
