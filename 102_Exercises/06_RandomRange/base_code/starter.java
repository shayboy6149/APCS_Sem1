/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int x = sc.nextInt();
		System.out.println("Please enter another integer");
		int y = sc.nextInt();
		int a = (int)(Math.random()*(y-x) + x);
		int b = (int)(Math.random()*(y-x) + x);
		int c = (int)(Math.random()*(y-x) + x);
		int d = (int)(Math.random()*(y-x) + x);
		int e = (int)(Math.random()*(y-x) + x);
		System.out.println(a + "," + b + "," + c + "," + d + "," + e );
	}
}
