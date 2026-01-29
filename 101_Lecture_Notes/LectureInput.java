/*
    Lecture note example - Input!!
*/
import java.util.Scanner;
class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double item1price = 15.99;
        double item2price = 6.59;
        double item3price = 25.29;
        System.out.println("Welcome to Shayboy's cafe");
        System.out.println("");
        System.out.println("who is this order for");
        String name = sc.nextLine();
        
        System.out.println("Here's out menu- $");
        System.out.println("1.🧆 fluffy falafel " + item1price);
        
        System.out.println("");
        System.out.println("2.🍧 Shayon's shaved ice " + item2price);
        
        System.out.println("");
        System.out.println("3.🥥 creamy coconut pudding " + item3price);
        
        System.out.println("");
        System.out.println("How many Fluffy Falafel's would you like");
        int quant1 = sc.nextInt();
        System.out.println("How many Shayon's shaved ice would you like");
        int quant2 = sc.nextInt();
        System.out.println("How many creamy coconut pudding's would you like");
        int quant3 = sc.nextInt();
        double total1 = (quant1 * item1price);
        double total2 = (quant2 * item2price);
        double total3 = (quant3 * item3price);
        double totalall =(total1 + total2 + total3);
        
        System.out.println("");
        System.out.println("what would you like to tip");
        double tipPercent = sc.nextDouble();
        double tip = totalall * (tipPercent/100);
        double grandtotal = tip + totalall;
        
        

        System.out.println( " receipt for " + name);
        System.out.println("-------------");
        System.out.println(quant1 + " Falafel = " +"$" + total1 );
        System.out.println("------------");
        System.out.println(quant2 + "shaved ice = "+"$" + total2);
        System.out.println("------------");
        System.out.println(quant3 + "coconut pudding = " +"$" + total3);

	}
}
