package Starpatterns2;

public class Demo3 {
	
public static void main(String[] args) {
	int star=1;
	int space=4;
	
	for(int i=1;i<=5;i++) { //outer for loop
		
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++) {
			System.out.print("*");
		}
		
		
		
		 System.out.println();
		 space--;
		 star++; 
		
		
		
	             }//outer for loop closes
	
	
}//main method closes

}
