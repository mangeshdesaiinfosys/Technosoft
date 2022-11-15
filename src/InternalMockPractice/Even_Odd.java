package InternalMockPractice;

import java.util.Scanner;

public class Even_Odd { // 
	
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("user enter number");
	 int num=s.nextInt();
	 
	 //checking even or odd no.
	 if(num%2==0) {
		 System.out.println("given number is even");
	           }
	 else {
		 System.out.println("given no.is odd");
	 }
	
	
}

}
