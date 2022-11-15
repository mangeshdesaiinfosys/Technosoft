package Starpatterns2;

public class Reverse_triangle {//user logic class
	public static void main(String[] args) { //main method
		 int star=5;
		 int space=0;
		
		for(int i=1;i<=5;i++) { //outer for loop
			
			for(int j=1;j<=space;j++) { //inner for loop for space
				System.out.print(" ");
			}
			
			for(int j=1;j<=star;j++) { //inner for loop for star
				System.out.print("*");
			}
			
			System.out.println();//for moving cursor to next line
			star--;
			space++;
			
		} //outer for loop ends
		
				
	}//main method closes

}//user logic class ends
