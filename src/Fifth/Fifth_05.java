package Fifth;
/*
 * 连续调用System.gc()和System.runFinalization()可能但是不一定会调用你的Finalizer（finalize是否会运行根据不同的JDK版本而不确定）。
 * 调用这些方法只是一个请求，它不代表finalizer一定会运行。总之，没有什么可以保证finalize()方法一定会被调用。
 */
public class Fifth_05 {

	static class Book {
		boolean checkOut = false;

//		Book(boolean logStatus) {
//			checkOut = logStatus;
//		}

//		void checkIn() {
//			checkOut = true;
//		}
//
//		void checkout() {
//			checkOut = false;
//		}

		protected void finalize() {
				System.out.println("be called final");
				// super.finalize();
		}
	}
	public static void main(String[] args) {
		new Book();
		System.gc();
		System.runFinalization();
	}

}
