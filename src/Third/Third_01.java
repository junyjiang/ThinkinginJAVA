package Third;

import java.awt.print.Printable;

class test{
	float c;
}

 class test1{
	static void f(test y){
		y.c = 'a';
	}
}
 
public class Third_01 {
	public static void main(String[] args){
		test TT = new test();
		TT.c = 'B';
		System.out.println("tt"+TT.c);
	}
	
}
