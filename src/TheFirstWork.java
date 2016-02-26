
class StaticTest{
	static int s = 47;
}
class Incrementable{
	static void increment(){
		StaticTest.s++;
	}
}
public class TheFirstWork {
	public static int i = 111;
	public static void main(String[] args){
		System.out.println(i);
		System.out.println("Hello World");
		class DataOnly{
			int i;
			double d;
			boolean b;
			void show(){
				System.out.println(i);
				System.out.println(d);
				System.out.println(b);
			}
		}
		DataOnly data = new DataOnly();
		data.i =1;
		data.d = 2.3333;
		data.b = true;
		data.show();
		class StoreStuff{
			int storage(String s){
				return s.length()*2;
			}
		}
		StoreStuff SS = new StoreStuff();
		System.out.println(SS.storage("TEST"));
		System.out.println("StaticTest.i= " + StaticTest.s);
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		System.out.println("st1.i= " + st1.s);
		System.out.println("st2.i= " + st2.s);
		Incrementable sf = new Incrementable();
		sf.increment();
		
	}

}
