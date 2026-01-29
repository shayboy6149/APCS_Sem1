/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first name and last name with a space in the middle.");
		String x = sc.nextLine();
		String y = x.substring(x.indexOf(" "));
		System.out.print("The last name is:" + y);
		
		
		
		


		
	}
}
