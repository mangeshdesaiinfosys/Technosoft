package Logical_Programms;

import java.util.Scanner;

public class prime_number { //user logic class
	
public static void main(String[] args) { //MAIN METHOD
	Scanner s=new Scanner(System.in);
	System.out.println("HEY USER ENTER ANY NO. TO CHECK ITS PRIME or NOT");
	     int num=s.nextInt();
	     int count=0;
	     
	     
	     for(int i=1;i<=num;i++) {
	    	 if(num%i==0) {
	    		 count++;
	    	 }
	    	 
	    	 } //for loop ends
	     if(count==2) {
	    	 System.out.println("NO. IS PRIME");
	     }
	     else {
	    	 System.out.println("NO. IS  NOT PRIME");
	     }
}

}
