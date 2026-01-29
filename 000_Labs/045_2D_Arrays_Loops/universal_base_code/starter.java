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
		System.out.println("how many rows would you like for your 2D array");
		int MaxRows = sc.nextInt();

		System.out.println("How many columns would you like for your 2D array?");
		int MaxColumns = sc.nextInt();
		
		int sum = 0;
		int [][] arr = new int[MaxRows][MaxColumns];
		for(int r = 0 ; r<arr.length ; r++){
			for(int c = 0 ; c<arr[0].length ; c++){
				int rand = (int)(Math.random()*10);
				arr[r][c] = rand;
				System.out.print(arr[r][c] + " ");
				sum = sum + arr[r][c];
			}
			System.out.println();
		}
		
		System.out.println("What row would you like to get the average of?");
		int ChooseRow = sc.nextInt();
		
		int RowAvg = 0;
		for(int i = 0; i<arr[0].length ; i++){
			RowAvg = RowAvg+arr[ChooseRow][i];
		}
		System.out.println("The row average was " + RowAvg/MaxColumns);
		System.out.println("The average of the 2D array is " + sum/(MaxColumns*MaxRows));


		
	}
}
