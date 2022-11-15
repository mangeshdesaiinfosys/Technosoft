package InternalMockPractice;

import java.util.Scanner;

public class EVENODD2 { //USER LOGIC CLASS
	
public static void main(String[] args) { //MAIN METHOD
	Scanner sc=new Scanner(System.in);
	System.out.println("HEY user enter any no. for checking even or odd");
	int num=sc.nextInt();
	
	if(num%2==0) {
		System.out.println("EVEN NUMBER");
	}
	else {
		System.out.println("ODD NUMBER");
	}
	
}

}
