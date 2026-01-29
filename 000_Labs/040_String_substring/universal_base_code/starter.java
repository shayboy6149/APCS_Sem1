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
		System.out.println("Enter a word.");
		String Resp = sc.nextLine();
		System.out.println("Letter by Letter");
		String [] arr = new String [Resp.length()];
		for(int i = 0 ; i<Resp.length() ; i++ ){
			arr[i]= Resp.substring(i,i+1);
		}
		
		for(int i = 0 ; i<Resp.length() ; i++ ){
			System.out.println(i + " " + arr[i]);
		}
		
		
		
		
		


		
	}
}
