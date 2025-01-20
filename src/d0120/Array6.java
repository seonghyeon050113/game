package d0120;

public class Array6 {
	public static void main(String[]args) {
		int[] nums = new int[6];
		//1-45까지 난수 생성
		//num의 각각 대입 짝수는 0
			for(int i =0;i<nums.length;i++) {
				int target = (int)(Math.random()*45);;
				if (target%2==1) {
					nums[i] = target ;
					
				}System.out.println(nums[i]);
			}
				
	}
}
