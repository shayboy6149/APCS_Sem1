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
		System.out.println("Enter a sentence.");
		String x = sc.nextLine();
		String ans = " ";
		while(x.indexOf(" ") != -1){
			int sigma = x.indexOf(" ");
			String word =x.substring(0,sigma);
			
			x = x.substring(sigma+1);
		
			ans = word + " " + ans;
			
			
		}
		System.out.print(x+ " " + ans);
		
		
		
		
		
		
		
		
		
		
		
	


		
	}
}
