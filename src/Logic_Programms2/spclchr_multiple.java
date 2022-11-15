package Logic_Programms2;

import java.util.Scanner;

public class spclchr_multiple { //USER LOGIC CLASS
	
public static void main(String[] args) { //MAIN METHOD
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("ENTER STRING WITH MULTIPLE SPECIAL SYMBOLS");
	
	String name=s.next();
	
	String correctname=name.replaceAll("[^a-zA-Z]","");
	
	System.out.println(correctname);
	
	
	
	}//MAIN METHOD ENDS

}//USR LOGIC CLASS ENDS
