package Methods;

public class SRM_call_from_sameclass { //CLASS BODY OPENS
	
public static void main(String[]args) { //MAIN METHOD BODY OPENS
	
	System.out.println("main method started");
	
      m1();
      m2();
      m3();
	System.out.println("main method is ended");
} //MAIN METHOD BODY CLOSES
 
   public static void m1() { //REGULAR METHOD m1 STARTS
	   System.out.println("i am running from method m1");
   } //m1 ends
   
   public static void m2() { //REGULAR METHOD m1 STARTS
	   System.out.println("i am running from method m2");
   } //m2 ends
   
   public static void m3() { //REGULAR METHOD m3 STARTS
	   System.out.println("i am running from method m3");
   } //m3 ends



} //CLASS BODY CLOSES
