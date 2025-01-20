package d0120;

public class Array3 {
	public static void main(String[]args) {
		String[] str = new String[10];
		for(int i=0;i<str.length;i++) {
			if((i+1)%3==0) {
				str[i]="짝";
			}else if((i+1)%5==0) {
				str[i]="만세";
			}else {
				str[i]= i+1+"";
			}
		System.out.println(i+":"+str[i]);	
		}
	}
}
