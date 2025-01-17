package d0117;

public class Static3 {
	static int age=10; //
	public static void main(String[]args) {
		Static3 s1 = new Static3();
		System.out.println(s1.age); //10
		s1.age =20;
		Static3 s2 = new Static3();	
		System.out.println(s2.age); //20
		//static 을 찍으면 서로 같은 공간에 저장함 //static의 값을 기억하고 저장함
		
	} 
}
