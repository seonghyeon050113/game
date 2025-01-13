package d0113;

public class Loop2 {
	public static void main(String []args) {
		for(int n=1;n<10;n++) {
			
			for(int i=1;i<10;i++) {
				System.out.print(n+"x"+i+"="+(n*i));
				if(i % 9 == 0 ) {
					System.out.print("");	
				}
				else {System.out.print(",");
				
				}
			}System.out.println("");			
		}
	}
}
