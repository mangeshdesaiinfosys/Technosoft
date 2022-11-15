package Starpatterns2;

public class Demo8 { //user logic class
	
public static void main(String[] args) { //main method
	int star=1;
	
	for(int i=1;i<=5;i++) { //ROWS outer
		
		for(int j=1;j<=star;j++) { //inner
			System.out.print("*");
		}
		
		System.out.println();
		star++;
		
		
		
	}
	
}

}
