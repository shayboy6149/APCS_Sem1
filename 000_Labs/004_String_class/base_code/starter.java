/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int Input = sc.nextInt();
		System.out.println("Here are the next 5 numbers!");
		System.out.println(Input + "" + (Input + 1) + "" + (Input + 2) + "" + (Input + 3) + "" + (Input + 4));
		System.out.println("Here are the next 5 multiples of " + Input);
		System.out.println(Input + "," + (Input*2) + "," + (Input*3) + "," + (Input*4) + "," + (Input*5) + "," + (Input*6));
		System.out.println("Here is " + Input + " divided by 100");
		System.out.println(Input/100.0);
		System.out.println("Here is " + Input + " divided by 10");
		System.out.println(Input/10.0);
		
		
	}
}
