package NSMCALL_FROM_SAMECLASS;

public class Sample { //CLASS BODY STARTS
	
public static void main(String[]args) { //MAIN METHOD BODY STARTS
	System.out.println("MAIN METHOD STARTS");	
	     
	   Sample s=new Sample(); //OBJECT CREATION
	         s.m1();
	         s.m2();
	System.out.println("MAIN METHOD ENDS");
} //MAIN METHOD BODY ENDS

 public void m1() { //NON STATIC m1 STARTS
	 System.out.println("i am from m1 non static regular method");
 }//m1 ENDS
 
 public void m2() { //NON STATIC m2 STARTS
	 System.out.println("i am from m2 non static regular method");
 }//m2 ENDS

} //CLASS BODY ENDS
