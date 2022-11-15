package Starpatterns2;

public class Demo5 { //user logic class
	public static void main(String[] args) {
		int space=3;
		int star=1;
		
	for(int i=1;i<=4;i++) { //outer loop for rows
		
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		     }
		
		for(int j=1;j<=star;j++) {
			System.out.print("*");
		        }
		System.out.println();
		space--;
	     star=star+2;
		
		 } //outer loop closes
		
		
		
		
	}

}
