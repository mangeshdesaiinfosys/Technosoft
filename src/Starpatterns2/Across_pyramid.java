package Starpatterns2;

public class Across_pyramid {//user logic class
	
public static void main(String[] args) { //main method
	
	int star=1;
	
	for(int i=1;i<=7;i++) { //outer loop for ROWS
		
		for(int j=1;j<=star;j++) {
			System.out.print("*");
		}
		
		System.out.println();
	if(i<=3) {
		star++;
		
	}
	else {
		star--;
	}
	
	
	
	
	
	
	
	}//outer loop ends
	
}

}
