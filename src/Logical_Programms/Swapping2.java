package Logical_Programms;

public class Swapping2 { //USER LOGIC CLASS
	public static void main(String[] args) {
		
	
	
	  //without using third variable
		System.out.println("BEFORE SWAPPING");
		  int a=10;
		  int b=20;
		  System.out.println("a is"+a+"and b is"+b);
		  
		  a=a+b; //30
		  b=a-b; //10
		  a=a-b; //20
		  System.out.println("AFTER SWAPPING");
		  System.out.println("a is"+a+"b is"+b);
		  
		  
}
}