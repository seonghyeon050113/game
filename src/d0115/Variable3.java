package d0115;

public class Variable3 {
	int i  = 10;
	public static void main(String[]args) {
		Variable3 v = new Variable3();
		
		System.out.println(v.i);
		Variable3 v2= new Variable3();
		System.out.println(v2.i);//새로운 변수이다
		
	}
}	
