package d0113;

import java.util.Random;
import java.util.Scanner;

public class Input2 {
	public static void main(String[]args) {
		
			{
			Random r = new Random();
			Scanner s = new Scanner(System.in);
			System.out.print("원하시는 숫자를 적으세요 :");
			String numStr = s.nextLine();
			int num = Integer.parseInt(numStr);
			int targetNum = r.nextInt(100)+1;//10
			System.out.print("니가 쓴 숫자: " + numStr);
			if (num<targetNum) {
				System.out.print("작다");
			}else if(num<targetNum) {
				
				System.out.print("크다");
			}else {
				System.out.print("맞다");
			}
			}
		
	}
}
