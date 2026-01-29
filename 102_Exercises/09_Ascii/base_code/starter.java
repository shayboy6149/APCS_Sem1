/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Ascii art. You have the option to print out an animal, object, or a face: ");
		String x = sc.nextLine();
		if(x.equals("animal")|| x.equals("Animal")){
			System.out.println(" \\ /");
			System.out.println(" ( )");
			System.out.println(" , ,");
			System.out.println(".   .");
			System.out.println(",   ,");
			System.out.println(" .o.");
		}
		else if(x.equals("object") || x.equals("Object")){
			System.out.println("  (");
			System.out.println(" ) )");
			System.out.println("  Y");
			System.out.println(":' ':");
			System.out.println(":   :");
			System.out.println(":   :");
			System.out.println(":   :");
			System.out.println(":   :");
			System.out.println(":   :");
			System.out.println(":   :");
			System.out.println("'___'");
		}
		else if (x.equals("face")|| x.equals("Face")){
			System.out.println("  ._'''_. ");
			System.out.println(" /(.) (.)\\");
			System.out.println(";    0   ;");
			System.out.println("\\ }----{ /");
			System.out.println(" ,-...- ,");

			
		}
		else{
			System.out.println("run code again");
		}
	}
}
