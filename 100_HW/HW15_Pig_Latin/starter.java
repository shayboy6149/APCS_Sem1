/*
   * Author:
   * Date:
   * Collaborator(s):
*/


import java.util.Scanner;



class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a sentence");
		String str = sc.nextLine();
		
		while(str.indexOf(" ") != -1){
			int space = str.indexOf(" ");
			String word = str.substring(0,space);
			String result = convertTheWord(word);
			System.out.print(result + " ");
			
		
			str = str.substring(space+1);
		}
		System.out.print(convertTheWord(str));
		
		
	}
	
	public static String convertTheWord(String input){
		String result = "";d 
		for(int i = 0 ; i< input.length() ; i++){
			
			if(input.substring(i,i+1).equals("a") || input.substring(i,i+1).equals("A") || input.substring(i,i+1).equals("E") ||input.substring(i,i+1).equals("e") || input.substring(i,i+1).equals("I") || input.substring(i,i+1).equals("i") ||input.substring(i,i+1).equals("O") || input.substring(i,i+1).equals("o") || input.substring(i,i+1).equals("U") || input.substring(i,i+1).equals("u")){
				if(i == 0){
					result = input + "-way";
					return result;
				
				}
				else {
					result = input.substring(i) + "-" + input.substring(0,i) + "ay";
					return result;
					
				}
			}
			
		}
		return input + "-ay";
			
		
		
	}
}
