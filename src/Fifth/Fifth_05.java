package Fifth;
/*
 * ��������System.gc()��System.runFinalization()���ܵ��ǲ�һ����������Finalizer��finalize�Ƿ�����и��ݲ�ͬ��JDK�汾����ȷ������
 * ������Щ����ֻ��һ��������������finalizerһ�������С���֮��û��ʲô���Ա�֤finalize()����һ���ᱻ���á�
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
