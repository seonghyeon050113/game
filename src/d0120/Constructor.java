package d0120;

public class Constructor {
	public Constructor() {
		System.out.println("어?내가 메모리를 생성했구나");
	}
	public static void main(String[]args) {
		Constructor c = new Constructor();
	//자바를 실행하기 위해서는 컴파일을 해야 한다
		//컴파일을 하면 클래스 파일  생성됨
		c= new Constructor();
	}
}
