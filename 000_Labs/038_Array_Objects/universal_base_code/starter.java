/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Wizard [] x = new Wizard[100];
		Warrior [] y = new Warrior[100];
		
		for(int i = 0 ; i<x.length ; i++){
			x[i] = new Wizard();
			y[i] =  new Warrior();
		}
		
		
		int Wiznum = 0;
		int Warnum = 0;
		
		while(!x[Wiznum].isDead() || !y[Warnum].isDead()){
			x[Wiznum].attack(y[Warnum]);
			
			if(y[Warnum].isDead()){
				Warnum++;
			}
			
			if(Warnum>=y.length){
				break;
			}
			
			y[Warnum].attack(x[Wiznum]);
			
			if(x[Wiznum].isDead()){
				Wiznum++;
			}
			if(Wiznum>=x.length){
				break;
			}
		}
		
		if (Warnum > Wiznum){
			System.out.println("the Warriors won with " + (x.length- Wiznum) + " left in their army.");
		}
		
		else{
			System.out.println("The Wizards won with " + (x.length - Warnum) + " left in their army.");
		}
		
		
		

	}
}
