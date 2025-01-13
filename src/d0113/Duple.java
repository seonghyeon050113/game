package d0113;

import java.util.Random;

public class Duple {
	public static void main(String[]args) {
//		int i = 10;
//		do {
//			System.out.println(i++);
//		}
//		0-4
//		while(1<10) {//참이면 반복됨
//			System.out.println(i++);
//		}
		int[] nums = new int[] {1,2};
		for(int i=0;i < nums.length;i++) {
			if (nums[i]==1) {
				System.out.println(i+"번째방에 2가 있다");
				break;
			}
		System.out.println(i);
		}
		
	}
}
