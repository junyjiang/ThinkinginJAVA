/*
 * page 46
 */
package Third;

import java.util.Random;

public class Third_04 {
	 public static void main(String[] args){
		 Random rand = new Random();
		 int i = rand.nextInt(100);
		 int j = rand.nextInt(100);
		 System.out.println(i);
		 System.out.println(j);
		 System.out.println("i>j: "+ (i>j));
		 System.out.println("i<j: "+ (i<j));
		 System.out.println("i<20&&j<20: "+(i<20&&j<20));
		 System.out.println("i>20&&j>20: "+ (i>20&&j>20));
		 System.out.println("i>20||j>20: "+ (i>20||j>20));
	 }
}
