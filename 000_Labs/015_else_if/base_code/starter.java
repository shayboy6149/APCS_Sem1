/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	int x = (int)(Math.random()*(1000)*1);
	System.out.println("Please enter your number");
	int y = sc.nextInt();
	if(y<x){
		System.out.println("Your number was smaller than the number. The number was " + x);
	}
	else if(y>x){
		System.out.println("Your number was greater than the number. The number was " + x);
	}
	else if (x == y){
		System.out.println("Your number is correct!");
	}
	
	
	
	}
}
