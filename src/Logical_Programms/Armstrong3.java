package Logical_Programms;

public class Armstrong3 { //user logic class
	
public static void main(String[] args) { //main method
	int num=40;
	int actnum=num;
	int r=0;
	int armnum=0;
	
	while(num>0) {
		r=num%10; //for extract number
		armnum=r*r*r+armnum;
		num=num/10; //FOR QUOTIENT
	}
	
	if(armnum==actnum) {
		System.out.println("ARMSTRONG");
	}
	else {
		System.out.println("NOT ARMSTRONG");
	}
}

}
