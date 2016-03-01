package Forth;

import java.util.Random;

public class Forth_03 {

	public static void main(String[] args){
		for(int i =0 ;i <10; i++){
			int a = new Random().nextInt(100)+3;
			if(isPrime(a)){
			System.out.println(a);}
			}
		}
	public static boolean isPrime(int num){
		for(int j =2 ;j<num;j++){
			if(num%j==0){
				return false;
			}
		}
		return true;
	}
}
