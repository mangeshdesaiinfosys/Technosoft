package Logical_Programms;

import java.util.Scanner;

public class REVERSE2 { //USER LOGIC CLASS
	
public static void main(String[] args) { //MAIN METHOD
	
Scanner sc=new Scanner(System.in);
System.out.println("ENTER STRING TO CHECK PALINDROME or NOT");
String org=sc.next();
String rev="";

 for(int i=org.length()-1;i>=0;i--) {
	 
	 rev=rev+org.charAt(i);
 }
	
	if(org.equals(rev)) {
		System.out.println("PALINDROME STRING");
	   }
	
	else {
		System.out.println("not PALINDROME STRING");
	}
}

}
