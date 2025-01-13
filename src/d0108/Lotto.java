package d0108;

import java.util.Random;

public class Lotto {
	public static void main(String[]args) {
		Random r = new Random();
		int[] nums = new int[6];;
			for(int i =0;i< nums.length;i++) {
				nums[i] = r.nextInt(44)+1;
				System.out.println(nums[i]);
			}
		//Array1을 참고하여 1-45까지 난수를 nums의 가 방에 대입하고
		//츨력하는 for 문을 만들어보시오
	}
}
