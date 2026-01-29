/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int[1000];
		int len = arr.length-1;

		for (int len2 = arr.length ; len2>0 ; len2--){
			arr[len] = (int)(Math.random()*1000 + 1);
			System.out.println(arr[len]);
		}


		
	}


		
	}
