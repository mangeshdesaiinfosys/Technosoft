package Starpatterns_NESTED_FOR_LOOPS;

public class E2 {//user logic class
	
public static void main(String[] args) { //main method
	
	for(int i=1;i<=5;i++) { //outer for loop starts
		for(int j=1;j<=5;j++) {

			if(i==j) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}	
			
		System.out.println();
		
			
			
			
		
	} //outer for loop ends
		
} //main method ends

}
