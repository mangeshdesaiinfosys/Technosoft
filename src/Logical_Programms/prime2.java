package Logical_Programms;

public class prime2 { //USER  LOGIC  CLASS
	
public static void main(String[] args) { //MAIN  METHOD
	int num=7;
	int count=0;
	
	for(int i=1;i<=num;i++) { //outer for loop
		
		if(num%i==0) {
			count++;
		}
		
	}//outer for loop ends
	System.out.println("number of counts are"+count);
	if(count==2) {
		System.out.println("its PRIME NO.");
	}
	else {
		System.out.println("its NOT PRIME NO.");
	}
	
	
}

}