package d0120;

public class Array2 {
	public static void main(String[]args) {
		String[] str = new String[10];
		//5의 배수
		for (int i =0;i<str.length;i++) {
			str[i] = (i*5) + 1 + "";
		}
		for (int i=0;i<str.length;i++) {
			System.out.println(i + ":" + str[i]);
		}
	}
}
