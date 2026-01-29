/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word or phrase:");
		String ans = sc.nextLine();
		for(int z = 0 ; z< ans.length() ; z++){
			if(ans.indexOf(ans.substring(z,z+1))%2 == 0){
				String Lower = ans.substring(z,z+1).toLowerCase();
				System.out.print(Lower);
				
			}
			else{
				String Upper = ans.substring(z,z+1).toUpperCase();
				System.out.print(Upper);
			}
			
		}
		
		
		
		
		

	}
}
