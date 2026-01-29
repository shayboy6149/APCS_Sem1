/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
    String owner;
    int countNumber;
    double Balance;
    boolean isActive;
    private static int nextAccountNumber = (int)(Math.random()*(1000-50)+50);

    public BankAccount(){
        owner = "unknown";
        countNumber = nextAccountNumber;
        Balance = 0;
        isActive = true;
        nextAccountNumber = nextAccountNumber + 1;
    }
    public BankAccount(String a){
        owner = a;
        Balance = 0;
        isActive = true;
        countNumber = nextAccountNumber;
        nextAccountNumber = nextAccountNumber + 1;
    }
    public BankAccount(String a, double b){
        owner = a;
        Balance = b;
        isActive = true;
        countNumber = nextAccountNumber;
        nextAccountNumber = nextAccountNumber + 1;
    }

    public void checkbalance(){
        System.out.println(Balance);
    }
    
    public void deposit(int a){
        balance = balance + a;  
    }
    
    public void witdraw(int a){
        balance = balance - a;
        if(a > balance){
            balance = balance;
        }
    }
    
    public void(){
        isActive = false;
        
    }
    
    public int getBalance(){
        return balance;
    }
    
    
    
    
    public void setOwner(String a){
        owner = a;
    }
    public String getOwner(){
        return owner;
    }

    public void displayAccountInfo(){
        System.out.println("Account owner: " + owner);
        System.out.println("Balance number: " + Balance);
        System.out.println("countnumber: " + countNumber);
        System.out.println("Account status: " + isActive);
    }
}