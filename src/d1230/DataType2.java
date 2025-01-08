package d1230;

public class DataType2 {
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i==10);
		int i2 =20;
		System.out.println(i+i2);
		System.out.println(i-i2);
		System.out.println(i*i2);
		System.out.println(i/i2);
		
		byte b = 127;
		short s = 127;
		s = b;//short가 byte 보다 크기 때문에 문제 없음
		b = (byte)s;
		
		long l= 100000000000000000L;
		
		float f = 1.1F;
		double d = 1.1;
		
	}

}
