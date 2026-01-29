/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test = new PooleDwarf();
		PooleDwarf a = new PooleDwarf();
		PooleDwarf b = new PooleDwarf();
		PooleDwarf c = new PooleDwarf();
		PooleDwarf d = new PooleDwarf();
		PooleDwarf e = new PooleDwarf();
		PooleDwarf f = new PooleDwarf();
		PooleDwarf g = new PooleDwarf();
		
		a.setName(randName());
		a.setAge(16);
		b.setName(randName());
		b.setAge(45);
		c.setName(randName());
		c.setAge(22);
		d.setName(randName());
		d.setAge(67);
		e.setName(randName());
		e.setAge(42);
		f.setName(randName());
		f.setAge(88);
		g.setName(randName());
		g.setAge(90);
		
		boolean I = a.isSameName(b.getName());
		boolean II = a.isSameName(c.getName());
		boolean III = a.isSameName(d.getName());
		boolean IV = a.isSameName(e.getName());
		boolean V = a.isSameName(f.getName());
		boolean VI = a.isSameName(g.getName());
		
		int rep = 0;
		int counter = 0;
		while(counter < 6){
			if(I = true && counter == 0){
			rep = rep + 1;
		}
		if(II = true && counter == 1){
			rep = rep + 1;
		}
		if(III = true && counter == 2){
			rep = rep + 1;
		}
		if(IV = true && counter == 3){
			rep = rep + 1;
		}
		if(V = true && counter == 4){
			rep = rep + 1;
		}
		if(VI = true && counter == 5){
			rep = rep + 1;
		}
		}
		System.out.println(a.getName() + "was the one with " + rep + "matches" );
		
	
		
	}
}
