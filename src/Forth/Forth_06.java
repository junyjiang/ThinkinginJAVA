package Forth;
/*
 * 쳲���������
 * ������Ҫ��������ָ���
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
