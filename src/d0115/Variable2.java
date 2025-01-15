package d0115;
 
import java.util.Random;
import java.util.Scanner;

public class Variable2 {
	int i ;
	String str;
	//5-7번 라인과 다르다 같은 변수 선언 가능
	public static void main(String[]args) {
		String str = new String("asdf");
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		Variable2 v = new Variable2();
		//객체 == 존재할 수 있는 무언가
		System.out.println(v.i); //0으로 초기화
		System.out.println(v.str);
	}
	
}
