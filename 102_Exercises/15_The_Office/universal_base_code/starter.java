/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee Dwight = new Employee(1987,"Dwight ", "Schrute", 4416.66);
		Dwight.employeeToString();
		Dwight.raiseSalary(5);
		System.out.println(Dwight.getAnnualSalary());
		
		Employee Jim = new Employee(2474, "Jim ", "Halpert",4416.66);
		Jim.employeeToString();
		Jim.raiseSalary(88);
		System.out.println(Jim.getAnnualSalary());
		
		
		Employee Pam = new Employee(2011, "Pam ", "Beesly", 2250);
		Pam.employeeToString();
		Pam.raiseSalary(41);
		System.out.println(Pam.getAnnualSalary());
		
		Employee Sendy = new Employee(6741, "Sendy ", "Sigma ",88);
		Sendy.employeeToString();
		Sendy.raiseSalary(99999999);
		System.out.println(Sendy.getAnnualSalary());
		
		
		
	}
}
