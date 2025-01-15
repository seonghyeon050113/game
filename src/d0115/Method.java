package d0115;

public class Method {
	int test() {
		return 0;
	}
	String test1() {
		return "";
	}
	//data type == 기본형 , 참조형
	//method == 데이터 타입을 리턴하는 것 , 리턴 하지 않는 것 (void)
	
	public static void main(String[]args) {
		Method m = new Method();
		m.test();
		int i = m.test();
		String str = m.test1();
		System.out.print(i);
		System.out.print(str);
	}
}
