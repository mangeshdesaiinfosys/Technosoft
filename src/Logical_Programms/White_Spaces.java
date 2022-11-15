package Logical_Programms;

import java.util.Scanner;

public class White_Spaces { //user logic class
	
public static void main(String[] args) { //main method
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Hey User plz enter string to count WHITE SPACES");
	     String name=sc.nextLine();
	
	
	
	int count=0;
	for(int i=0;i<=name.length()-1;i++) { //outer for loop
		 char v=name.charAt(i);//every character will come into iteration by chatAt() method
		
		if(v==' ') {
			count++;
		}
		
		
		
	} //outer for loop ends
	
	System.out.println("TOTAL NO. OF WHITE SPACES IN GIVEN STRING are"+" "+count);
	
}

}
