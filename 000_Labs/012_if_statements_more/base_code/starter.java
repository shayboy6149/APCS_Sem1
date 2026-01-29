/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter an integer");
 int Input = sc.nextInt();
 System.out.println("Give me another number");
 int Iny = sc.nextInt();
 boolean Outy = Input == Iny;
 System.out.println(Outy);
}
}