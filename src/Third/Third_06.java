package Third;

import java.util.Scanner;

public class Third_06 {
	public static void main(String[] args){
		Scanner s1 = new Scanner(System.in);
		String str1 =s1.next();
		Scanner s2 = new Scanner(System.in);
		String str2 = s2.next();
		String t1 = "test";
		String t2 = "test";
		if(str1 == str2){
			System.out.println("str1==str2: " + str1==str2);
		}else{
			System.out.println("str1==str2: " + str1==str2);
		}
		if(str1.equals(str2)){
			System.out.println(str1.equals(str2));
		}else{
			System.out.println(str1.equals(str2));
		}
		if(t1 == t2){
			System.out.println("t1==t2: " + t1 == t2);
		}else{
			System.out.println("t1==t2: " + t1 == t2);
		}
		if(t1.equals(t2)){
			System.out.println("t1.equals(t2): " + t1.equals(t2));
		}else{
			System.out.println("t1.equals(t2): " + t1.equals(t2));
		}
		
	}

}
