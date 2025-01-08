package d0108;

import java.util.Random;

public class Lotto2 {
	public static void main(String[]args) {
		Random r = new Random();
		int[] nums = new int[7];
			for(int i=0; i < nums.length;i++) {
				nums[i] = r.nextInt(49)+1;
				System.out.println(nums[i]);
						
			}
		// 총 7개를 맞춰야 하는 게임이며
		// 난수는 1-50 까지의 수
	}
}
