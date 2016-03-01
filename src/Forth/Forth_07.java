package Forth;

public class Forth_07 {
	static int q(int n){
		return n/1000;
	}
	static int b(int n){
		return n%1000/100;
	}
	static int s(int n){
		return n%1000%100/10;
	}
	static int g(int n){
		return n%1000%100%10;
	}
	static int com(int i,int j){
		return i*10+j;
	}
	static void Vampiretest (int n, int i,int j){
		if(i*j ==n){
			System.out.println(n+"=="+i + "*" + j);
		}
	}
	public static void main(String[] args){
		for (int num =1001;num<9999;num++){
			Vampiretest(num, com(q(num), b(num)), com(s(num), g(num)));
			Vampiretest(num, com(q(num), b(num)), com(g(num), s(num)));
			Vampiretest(num, com(q(num), s(num)), com(b(num), g(num)));
			Vampiretest(num, com(q(num), s(num)), com(g(num), b(num)));
			Vampiretest(num, com(q(num), g(num)), com(b(num), s(num)));
			Vampiretest(num, com(q(num), g(num)), com(s(num), b(num)));
			Vampiretest(num, com(b(num), q(num)), com(s(num), g(num)));
			Vampiretest(num, com(b(num), q(num)), com(g(num), s(num)));
			Vampiretest(num, com(b(num), s(num)), com(g(num), q(num)));
			Vampiretest(num, com(b(num), g(num)), com(s(num), q(num)));
			Vampiretest(num, com(s(num), q(num)), com(g(num), b(num)));
			Vampiretest(num, com(s(num), b(num)), com(g(num), q(num)));
			
		}
	}
}
