import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Each player starts with $100 ");
        System.out.println("2. Input a wager less than your total amount of money.");
        System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
        System.out.println("   a. If two numbers match, you double your money.");
        System.out.println("   b. If none match, you lose your money");

        int money = 100;

        while (money > 0) {
            System.out.println("Would you like to play the slots? (Yes/yes/Y/y): ");
            String Yes = sc.nextLine();

            if (Yes.equals("Yes") || Yes.equals("yes") || Yes.equals("Y") || Yes.equals("y")) {

                System.out.println("You have $" + money + ". How much would you like to wager?");
                int gamble = sc.nextInt();
                sc.nextLine(); 

                int a = (int)(Math.random()*10 + 1);
                int b = (int)(Math.random()*10 + 1);
                int c = (int)(Math.random()*10 + 1);

                System.out.println("Great! Let's play!!!");
                System.out.println("Your rolls are:");
                System.out.println("| " + a + " | " + b + " | " + c + " |");

                if ((a != b) && (b != c) && (a != c)) {
                    System.out.println("Didn't win this time, better luck next time!");
                    money = money - gamble;
                }
                else if ((a == b) && (b != c) && (a != c)) { 
                    System.out.println("You won! Your wager has now been doubled!");
                    money = money + gamble;
                }
                else if ((a != b) && (b == c) && (a != c)) { 
                    System.out.println("You won! Your wager has now been doubled!");
                    money = money + gamble;
                }
                else if ((a != b) && (b != c) && (a == c)) { 
                    System.out.println("You won! Your wager has now been doubled!");
                    money = money + gamble;
                }
                else if ((a == b) && (b == c) && (a == c)) { 
                    System.out.println("You won! Your wager has now been tripled!");
                    money = money + gamble*2;
                }
                else { 
                    System.out.println("You won! Your wager has now been doubled!");
                    money = money + gamble;
                }

                System.out.println("You now have " + money + " dollars");

            } else if (Yes.equals("No") || Yes.equals("no") || Yes.equals("N") || Yes.equals("n")) {
                System.out.println("Sad to see you go! You still have $" + money + " left. Come again soon! Thanks!");
                break;
            } else {
                System.out.println("That wasn't quite the correct answer. Try again.");
            }
        }
    }
}
