/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		BankAccount a = new BankAccount("Alice", 250.0);
        a.checkbalance();
        a.displayAccountInfo();
        
        Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Poole ATM!");
		System.out.println("We're going to create a bank account! What info do we know?");
		System.out.println("1 - Nothing");
		System.out.println("2 - Owner");
		System.out.println("3 - Owner and Initial Deposit");
		
		int Response = sc.nextInt();
		sc.nextLine();
		
		
		if(Response == 1){
			BankAccount q = new BankAccount();
			q.displayAccountInfo();
			System.out.println("Would you like to check your balance of this account? (yes/no)");
			sc.nextLine();
			String YesOrNo = sc.nextLine();
			if(YesOrNo.equals("Yes") || YesOrNo.equals("yes")){
			System.out.print("Balance: " + "");  
			q.checkbalance();
			System.out.println("Thank you for coming to the Poole ATM!");
			}
			else if(YesOrNo.equals("No") || YesOrNo.equals("no")){
			System.out.println("Great! No balance checked.");
			System.out.println("Thank you for coming to the Poole ATM!");
			}
			else{
				System.out.println("You don't like to listen to instructions :P");
			}
		}
		if(Response == 2){
			System.out.println("What is the name of the owner of this bank account?");
			String sigma = sc.nextLine();
			BankAccount r = new BankAccount(sigma);
			r.displayAccountInfo();
			
			System.out.println("Would you like to check your balance of this account? (yes/no)");
			String YesOrNoTwo = sc.nextLine();
			if(YesOrNoTwo.equals("Yes") || YesOrNoTwo.equals("yes")){
			System.out.print("Balance: " + "");  
			r.checkbalance();
			System.out.println("Thank you for coming to the Poole ATM!");
			}
			else if(YesOrNoTwo.equals("No") || YesOrNoTwo.equals("no")){
			System.out.println("Great! No balance checked.");
			System.out.println("Thank you for coming to the Poole ATM!");
			}
			else{
				System.out.println("You don't like to listen to instructions :P");
			}
			
		}
		
		if(Response == 3){
			System.out.println("What is the name of the owner of this bank account?");
			String sigmaTwo = sc.nextLine();
			
			System.out.println("How much are you initally depositing into this account?");
			double deposit = sc.nextDouble();
			sc.nextLine();
			
			BankAccount s = new BankAccount(sigmaTwo,deposit);
			s.displayAccountInfo();
			
			System.out.println("Would you like to check your balance of this account? (yes/no)");
			String YesOrNoTwo = sc.nextLine();
			if(YesOrNoTwo.equals("Yes") || YesOrNoTwo.equals("yes")){
			System.out.print("Balance: " + "");  
			s.checkbalance();
			System.out.println("Thank you for coming to the Poole ATM!");
			}
			else if(YesOrNoTwo.equals("No") || YesOrNoTwo.equals("no")){
			System.out.println("Great! No balance checked.");
			System.out.println("Thank you for coming to the Poole ATM!");
			}
			else{
				System.out.println("You don't like to listen to instructions :P");
			}
			
		}
		
		
		
		

		
	}
}
