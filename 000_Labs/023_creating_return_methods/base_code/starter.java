/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your base number?");
		int a = sc.nextInt();
		System.out.println("what is your exponent");
		int b = sc.nextInt();
		System.out.println(pow(a,b));

	}
	public static int pow(int a, int b){
		int answer = 1;
		int x = a;
		int y = b;
		while(y>0){
			answer=answer*x;
			y=y-1;
		}
		return answer;
	}
}
