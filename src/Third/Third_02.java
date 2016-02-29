package Third;
import java.util.*;

public class Third_02 {
	public static void main(String[] args){
		System.out.println("请输入距离：");
		Scanner l = new Scanner(System.in);
		float length = l.nextFloat();
		System.out.println("请输入时间:");
		Scanner t = new Scanner(System.in);
		float time = t.nextFloat();
		System.out.println("速度" + length / time);
		
	}

}
