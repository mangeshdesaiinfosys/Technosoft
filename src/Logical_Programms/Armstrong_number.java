package Logical_Programms;

import java.util.Scanner;

public class Armstrong_number { //user logic class
	
public static void main(String[] args) { //MAIN METHOD
	Scanner s=new Scanner(System.in);
	System.out.println("plz enter number");
	int num=s.nextInt(); //for entering number by user
					
	int actnum=num;
	int r=0;
	int armnum=0;
	 while(num>0) {
		 r=num%10;
		 armnum=r*r*r+armnum;
		 num=num/10; //for quotient
		 
	 }
	if(armnum==actnum) {
		System.out.println("NO. IS ARMSTRONG");
	}
	else {
		System.out.println("NO. IS NOT ARMSTRONG");
	}
	
}

}
