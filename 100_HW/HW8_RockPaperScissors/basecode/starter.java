/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static String getObject(int a, int b, int c){

        int x = (int)(Math.random()*3+1);
        if(x == a){
            return "rock";
        }
        else if(x == b){
            return "paper";
        }
        else{
            return "scissors";
        }
    }
        
    public static int compare2(String player1, String player2){
        if(player1.equals(player2)){
                return 0;
            }
            else if(player1.equals("rock") && player2.equals("scissors")){
               return 1;
            }
            else if(player1.equals("rock") && player2.equals("paper")){
               return 2;
            }
            else if(player1.equals("paper") && player2.equals("scissors")){
                return 2;
            }
            else if(player1.equals("paper") && player2.equals("rock")){
                return 1;
            }
            else if(player1.equals("scissors") && player2.equals("rock")){
            return 2;
        }
        else {
            return 1;
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
           
        System.out.println("Would you like to play the computer? (yes/no/done)");
        String Ans = sc.nextLine();
         if(Ans.equals("done")){
                System.out.println("Thanks for playing");
                break;
            }
        if(Ans.equals("yes")){
            String computer = getObject(1,2,3);
            System.out.println("Please enter rock/paper/scissors:");
            String choice = sc.nextLine();
           if(compare2(computer,choice)==1){
               System.out.println("you lose");
               System.out.println("Would you like to play the computer? (yes/no/done)");
               Ans = sc.nextLine();
           }
           else if(compare2(computer,choice)==2){
               System.out.println("you win");
               System.out.println("Would you like to play the computer? (yes/no/done)");
               Ans = sc.nextLine();
           }
           else {
               System.out.println("Tie");
               System.out.println("Would you like to play the computer? (yes/no/done)");
               Ans = sc.nextLine();
           }
           
           
       
    
        }
        else if(Ans.equals("no")){
            System.out.println("How many times would you like the computer to play itself?");
            int Response = sc.nextInt();
            int counter1 = 0;
            int counter2 = 0;
            int counter3 = 0;
            while(Response > 0){
                String comp1 = getObject(1,2,3);
                String comp2 = getObject(1,2,3);
                if(compare2(comp1,comp2)==0){
                    counter3++;
                }
                if(compare2(comp1,comp2)==1){
                    counter1++;
                }
                if(compare2(comp1,comp2)==2){
                    counter2++;
                }
                
                Response--; 
            }
            System.out.println("Player 1 wins " + counter1 +  " times");
            System.out.println("Player 2 wins " + counter2 +  " times");
            System.out.println("They tied " + counter3 +  " times");
            
            System.out.println("Would you like to play the computer? (yes/no/done)");
            sc.nextLine();
            Ans = sc.nextLine();
            
        }
        }
            
        

    }
}
