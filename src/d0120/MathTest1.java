package d0120;

public class MathTest1 {
	public static void main(String[]args) {
		//math m = new math(); math가 privite라 안됨
		Math.random();
		double db = Math.random();
		System.out.println(db);//0.0-0.999..
		int i  = 1+(int)(db*10); //0-9 에서 1을 더해서 1-10
		System.out.println(i);
	}
}
