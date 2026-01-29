/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int rand = (int)(Math.random()*(200-51)+51);
		int [] x = new int [rand];
		int len = x.length;
		
		for(int i = 0 ; i < x.length; i++){
		x[i] = (int)(Math.random()*(100-1)+1);
	}
	int min = Integer.MAX_VALUE;
	for(int i = 0 ; i<len ; i++){
		if(x[i]<min){
			min = x[i];
		}
	}
	System.out.println("The minumum of 1000 random numbers is:" + min);
	
	int max = Integer.MIN_VALUE;
	for(int i = 0; i<len ; i++){
		if(x[i] > max){
			 max = x[i];
		}
	}
	System.out.println("the maximum of these 1000 random numbers is: " + max);
}
}
