package d0117;

public class Static2 {
	int age =1;
	static int health;
	
	void test(int n) {
		System.out.println("테스트 시작");
		if(n==1) {
			return;
		}
		System.out.println("테스트 종료");
	}
	public static void main(String[]args) {
		health = 1;//위에서 로딩해서 이미 기억함
		System.out.print(health);
		Static2 s = new Static2();
		System.out.print(s.age);
		System.out.print(s.health);
		s.test(1);
	}
}
	
