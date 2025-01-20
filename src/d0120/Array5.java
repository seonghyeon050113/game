package d0120;

import java.util.Random;

public class Array5 {
	public static void main(String[]args) {
		int[] num = new int[6];
		//1부터 45까지의 난수를 생성하여서
		//num의 0부터 5번째 방까지 대입
		for (int i=0; i<num.length; i++) {
			int in = (int)(Math.random()*44);//0-44
			num[i]=in+1;//1-45
			System.out.println(num[i]);
		}
	}
}
