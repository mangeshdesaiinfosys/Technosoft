package Logic_Programms2;

import java.util.Scanner;

public class Even_Odd { //user logic class
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	System.out.println("hey user plz enter number to check");
	
	    int num=s.nextInt(); //logic code for entering number
	    
	    if(num%2==0) {
	    	System.out.println("EVEN NUMBER");
	    }

	    else {
	    	System.out.println("ODD NUMBER");
	    }
	
	    
	
}

}
