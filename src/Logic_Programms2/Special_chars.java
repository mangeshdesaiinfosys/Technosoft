package Logic_Programms2;

import java.util.Scanner;

public class Special_chars { //user logic class

public static void main(String[] args) { //main method
	Scanner s1=new Scanner(System.in);
	
	System.out.println("ENTER STRING WITH SPECIAL CHARACTER");
	
	String name=s1.next();
	
	
	String correctname=name.replace("@", "U");
	
	System.out.println(correctname);
	
	
	
}

}
