package d0113;

import java.util.Random;

public class Duple2 {
	public static void main(String[]args) {
		Random r = new Random();
		int[] nums = new int[5];
		//nums에 1부터 10까지의 난수 입력
		for(int i=0;i<nums.length;i++)
			nums[i] =r.nextInt(10)+1;
			System.out.println(nums[2]);
			
	}
}
