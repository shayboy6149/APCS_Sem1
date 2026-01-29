/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("The goal of the game is to guess a word with two hints! ");
int x = (int)(Math.random() * 2) + 1;
if(x==1){
System.out.println("It's a fruit!");
System.out.println("What is your guess?");
String answer = sc.nextLine();
if((answer.equals("apple")) || answer.equals("Apple")){
 System.out.println("Your answer is correct. Woo!");
}
else{
System.out.println("You didn't get the answer right. Here is another hint. It is a red fruit");
answer = sc.nextLine();
if(answer.equals("apple") || answer.equals("Apple")){
 System.out.println("Your answer is correct. Woo!");
}
else{
System.out.println("Sorry, the answer was " + answer );
}
}
}
else{System.out.println("It's a planet!");
System.out.println("What is your guess?");
String answer = sc.nextLine();
if((answer.equals("Earth")) || answer.equals("earth")){
 System.out.println("Your answer is correct. Woo!");
}
else{
System.out.println("You didn't get the answer right. Here is another hint. It's the only planet with humans on it");
answer = sc.nextLine();
if(answer.equals("Earth") || answer.equals("earth")){
 System.out.println("Your answer is correct. Woo!");
}
else{
System.out.println("Sorry, the answer was " + answer );
}
}
}

}
}