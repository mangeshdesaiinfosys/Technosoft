package Starpatterns2;

public class Demo7 { //user logic class
	
public static void main(String[] args) { //main method
	int star=1;
	
	
	for(int i=1;i<=7;i++) { //outer loop starts
		
		
		for(int j=1;j<=star;j++) { //inner loop starts
			System.out.print("*");
		} //inner loop ends
		
		System.out.println();
	
          	if(i<=3) {
		     star++;
	        }
	        else {
	     	star--;
	             }
} //outer loop closes

}
}