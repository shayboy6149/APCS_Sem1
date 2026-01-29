/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] arr = new int[1000];
		int x = 0;
		int y = arr.length;
		
		while(x<arr.length){
			arr[x] = y;
			System.out.println(arr[x]);
			x++;
			y--;
		}
		
		int [] arrgh = new int[1000];
		int q = 0;
		int v = 3;
		
		while(q < arrgh.length){
			arrgh[q] = v;
			System.out.println(arrgh[q]);
			q++;
			v= v + 3;
		}
	}
}
