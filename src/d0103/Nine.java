package d0103;

public class Nine {
	public static void main(String[]args) {
		//9의 배수가 될때 짝 
		for (int i=1;i<=100;i++) {
			System.out.println(i);
			if(i%10==9||i/10==9)
				System.out.println("짝");
		}
	}
}
