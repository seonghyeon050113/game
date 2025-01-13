package d0113;

import java.util.Random;

public class Array3 {
	public static void main (String[]args) {
		Random r = new Random(); 
		String[] strs = new String[3];
		//1부터 5까지의 난수를 strs에 대입하다
		for (int i=0;i<strs.length;i++) {
		strs[i] = r.nextInt(5)+1+"";
		}
	}
}
