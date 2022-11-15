package Logical_Programms;

import java.util.Scanner;

public class Armstrong2 { //user logic class
	
public static void main(String[] args) { //MAIN METHOD
	Scanner s=new Scanner(System.in); 
	System.out.println("HEY  USER PLZ ENTER NO. FOR CHECKING");
	      int num=s.nextInt();
	
	 int actnum=num;
	 int r=0;
	 int armnum=0;
	 
	 while(num>0) {
		 r=num%10; //to extract number
		 armnum=r*r*r+armnum;
		 num=num/10;
	 }
	
	if(armnum==actnum) {
		System.out.println("GIVEN NUMBER IS ARMSTRONG");
	}
	else {
		System.out.println("NOT ARMSTRONG");
	}
	
	
}

}
