/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static boolean checkprime(int a){
		int loop = 2;
		int checker = a;
		int x = 0;
		while(loop<=a){
			if(loop == a){
				return true;
			}
			x = checker % loop;
			if(x == 0){
			return false;
			}
			loop = loop+1;
		}
		return true;
	}
	
	public static void printPrimes(int b){
		int prime = b;
		int counter = 2;
		while(counter< prime) {
			boolean check = checkprime(counter);
			if(check) {
				System.out.println(counter);
			}
			counter = counter + 1;
		}
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Input a number and we'll print out every prime until that number");
	int input = sc.nextInt();
	System.out.println(checkprime(input));
	printPrimes(input);
	
	}
}
