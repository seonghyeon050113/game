package d0103;

public class Six {
	public static void main(String[]args) {
		//6의 배수가 될때 짝 
		for (int i=1;i<=100;i++) {
			System.out.println(i);
			if(i%10==6||i/10==6)
				System.out.println("짝");
		}
	}
}
