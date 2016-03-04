package Fifth;

public class Fifth_04 {
	 static class test{
		void test(int i){
			test1("ddd");
			this.test1("test");
		}
		void test1(String str){
			System.out.println(str);
		}
	}
	public static void main(String[] args){
		test t = new test();
		t.test(111);
	}

}
