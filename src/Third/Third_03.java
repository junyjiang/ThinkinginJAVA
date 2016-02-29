/*
 * page 45
 */
package Third;

import java.util.Scanner;

class Dog{
	String Name;

}

public class Third_03 {
	
	public static void main(String[] args){
		Dog dd = new Dog();
		Scanner test = new Scanner(System.in);
		dd.Name = test.next();
		String bark;
		if(dd.Name.equals("spot")){
			bark = "Ruff";
		}else if(dd.Name.equals("scruffy")){
			bark ="Wurf";
		}else {
			bark ="wang wang wang";
		}
		System.out.println("DogName:"+dd.Name +"\nDogBark:"+ bark);
	}
	
}