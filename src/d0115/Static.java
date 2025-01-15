package d0115;

public class Static {
	static int i;//메모리 선언 안해도 됨
	static int rest() {
		return 1;
	}
	public static void main(String[]args) {
		
		System.out.print(i);
		rest();
	}
}
