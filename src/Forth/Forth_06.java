package Forth;
/*
 * 斐波那契数列
 * 输入需要输出的数字个数
 */
import java.util.Scanner;

public class Forth_06 {
		static int fib(int num){
			if(num<2){
			return 1;
			}else{
				return(fib(num-2)+fib(num-1));
			}
		}
	public static void main(String[] args){
		Scanner n = new Scanner(System.in);
		int i = n.nextInt();
		System.out.println(i);
		for(int j=0;j<i;j++)
			System.out.println(fib(j));;
	}
}
