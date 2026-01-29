/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	String owner;
	int countNumber;
	double Balance;
	boolean isActive;
	private static int nextAccountNumber= (int)(Math.random()*(1000-50)+50);

	// -------CONSTRUCTORS-------
	public BankAccount(){
		owner = "unkown";
		countNumber= nextAccountNumber;
		Balance = 0;
		isActive = true;
		nextAccountNumber= nextAccountNumber +1;
	}
	public BankAccount(String a){
		owner = a;
		Balance = 0;
		isActive = true;
		countNumber = nextAccountNumber;
		nextAccountNumber = nextAccountNumber+1;
	}
	public BankAccount(String a, double b){
		owner = a;
		 Balance = b;
		 isActive = true;
		 countNumber = nextAccountNumber;
		 nextAccountNumber = nextAccountNumber + 1;
	}
		
	

	// -------METHODS-------

}