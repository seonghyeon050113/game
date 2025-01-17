package d0117;

public class Array1 {
	public static void main(String[]args) {
		int[] nums = new int[2];
		nums[0] = 20;
		nums[1] = 22;
		int[] tmp = nums; //tmp[]=={20,22}
		nums = new int[3]; //nums[]=={0,0,0} 
		nums = tmp; //nums[]=={20,22}
		System.out.print(nums);
		nums = new int[nums.length+1]; //3
		for(int i=0;i<=tmp.length;i++) {
			nums[i]= tmp[i];
		}
		nums = new int
		
	}
}	
