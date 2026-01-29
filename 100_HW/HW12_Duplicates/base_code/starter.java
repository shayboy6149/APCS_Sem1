/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr = new int [20];
		System.out.println("These are the 20 numbers");

		for( int i = 0; i< arr.length ; i++){
			arr[i] = (int)(Math.random()*(10-1) +1);
			System.out.print(arr[i] + " ");
			
			
			
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
		
		
		int duplicate = (int)(Math.random()*(10-1) +1);
			System.out.println("the duplicate is " + duplicate);
			
			int counter = 0;
		for(int i = 0; i < arr.length ; i++){
			
			if(arr[i] == duplicate){
				System.out.println("match found at array " + i);
				counter++;
			}
			
		}
		
		System.out.println("the total number of duplicates is " + counter);
		
		System.out.println();
		System.out.println("----------------------------------------------------");
		
		for(int i = 0; i<arr.length-1; i++){
			if(arr[i] == arr[i+1]){
				System.out.println("Two in a row found at " + (i) + " and " + (i+1) + ". The number was " + arr[i]);
			}
		}
		
		

	}
}
