package Forth;

import java.util.Random;

public class Forth_04 {
	
	public static class Middle{
		static int test(int num,int begin, int end){
			if(num>=begin&&num<=end){
				return 1;
			}
			return -1;
			
		}
	}
	public static void main(String[] args){
		int i;
		System.out.println(Middle.test(i =new Random().nextInt(10), 4, 7)+" " + i);
	}
	
		
}
