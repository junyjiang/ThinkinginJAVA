package Fifth;

public class Fifth_02 {
	public static class test{
		void overloadtest(int i){
			System.out.println(i);
		}
		void overloadtest(String str){
			System.out.println(str);
		}
	}
	public static void main(String[] args){
		test t = new test();
		t.overloadtest(111);
		t.overloadtest("Test for overloading");
	}

}
