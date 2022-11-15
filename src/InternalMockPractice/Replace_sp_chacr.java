package InternalMockPractice;

import java.util.Scanner;

public class Replace_sp_chacr {
	
	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("ENTER STRING WHICH CONTAINS SPL CHARACTERS");
		
		String name=s1.next(); //to enter string input
		String correctname=name.replace("$","S");
		System.out.println(correctname);
		
		
	}

}
