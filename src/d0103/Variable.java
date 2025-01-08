package d0103;

public class Variable {
	public static void main(String[]args) {
		//배열
		int[] nums = new int[5];
		
		System.out.println(nums[0]);
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 4;
		nums[4] = 5;
		
		for(int i=0;i<=5;i++) {
			nums[i] = i+1;
			
			}
				
		for(int i=0;i<=5;i++) {
			System.out.println(nums[i]);
		}
	
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		//nums의 데이터 타입은 int 배열이다, int 배열을 하면 배열 하나는 int 타입이고 0으로 초기화 된다
		
	}
}
