package Forth;

import java.util.Random;

public class Forth_02 {
	public static void main(String[] args){
		int b =0;
		for(int i =0; i<25; i++){
			Random rand = new Random();
			int j = rand.nextInt(100);
			if(i<1){
				System.out.print("j: "+j + "\n");
			}else if(j>b){
				System.out.print("后数>前数" +j + " " + b + "\n");
			}else if(j<b){
				System.out.print("后数<前数" +j + " "  + b + "\n");
			}else {
				System.out.print("后数=前数" +j + " "  + b + "\n");
			}
			b=j;
		}
	}
}
