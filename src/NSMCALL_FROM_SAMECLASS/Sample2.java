package NSMCALL_FROM_SAMECLASS;

public class Sample2 { //CLASS BODY STARTS
	
public static void main(String[] args) {//MAIN METHOD STARTS
	System.out.println("MAIN METHOD STARTS");
	
	           Sample2 s2=new Sample2(); //OBJECT CREATION
	             s2.m1(); //METHOD CALLING STATEMENT
	             s2.m2(); 
	
	System.out.println("MAIN METHOD ENDS");
}
      public void m1() { //NON STATIC REGULAR METHOD m1
    	  
    	  System.out.println("I am from m1");
      }

      public void m2() { //NON STATIC REGULAR METHOD m2
    	  System.out.println("I am from m2");
      }

}
