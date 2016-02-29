package Third;

class test{
	float c;
}

public class Third_01 {
	
	public class test1{
		void f(test y){
			y.c = 'a';
		}
	}
	public static void main(String[] args){
		test TT = new test();
		TT.c = 'B';
		System.out.println("tt"+TT.c);
		
		
	}
	
}
