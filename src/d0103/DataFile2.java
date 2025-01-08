package d0103;

public class DataFile2 {
	public static void main(String[]args) {
		int i = 1;
		byte b = (byte)i;		
		i = b;
		String str = i+"";
		i = Integer.parseInt(str);
		System.out.println(str);
	}
}
