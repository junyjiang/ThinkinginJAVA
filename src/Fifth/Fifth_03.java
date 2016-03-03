package Fifth;

public class Fifth_03 {
	static class Dog{
		void bark(int i){
			System.out.println("int int"+i);
		}
		void bark(float i){
			System.out.println("float float"+i);
		}
		void bark(String i){
			System.out.println("String String"+i);
		}
		void bark(Double i){
			System.out.println("Double Double"+i);
		}
	}
	public static void main(String[] args){
		Dog D = new Dog();
		float x =1;
		double y =1;
		D.bark(1);
		D.bark(x);
		D.bark(y);
		D.bark("test");
	}

}
