package d0103;

public class Even {
	public static void main(String[]args){
		//1부터 100까지 출력을 하되 짝수 일때만 출력
		for(int i=1; i<=100;i++) {
			if(i%2==0)
				System.out.println(i);
		}
	}
}
