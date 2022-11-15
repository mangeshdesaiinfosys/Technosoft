package PRACTISE_METHODS;

public class NSM_Same_Class { //CLASS BODY STARTS

public static void main(String[]args) {
	System.out.println("MAIN METHOD STARTED");
	
	NSM_Same_Class s=new NSM_Same_Class();
	    s.m1();
	    s.m2();
	
}//MAIN METHOD ENDS

 public void m1() {
	 System.out.println("i am from non static regular method m1");
 }
 public void m2() {
	 System.out.println("i am from non static regular method m2 ");
 }
} //CLASS BODY ENDS
