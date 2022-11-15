package Variables;

public class OBJECT1 { //CLASS BODY OPEN
	
	static int i=100; //Global Static Variable
	
	       long l=31827953679l; //GLOBAL NON STATIC VARIABLE
	       double d=7.11011;
	       boolean b=true;
	       String s="VELOCITY";
	
public static void main(String[]args) { //MAIN METHOD BODY OPEN
	        
	 System.out.println(i); //100
	 
	 OBJECT1 A=new OBJECT1(); //OBJECT CREATION FOR EVERY NON STATIC GLOBAL VARIABLE
	 OBJECT1 B=new OBJECT1();
	 OBJECT1 C1=new OBJECT1();
	 OBJECT1 D1=new OBJECT1();
	 System.out.println(A.l); //31827953679
	 System.out.println(B.d);//7.11011
	 System.out.println(C1.b); //TRUE
	 System.out.println(D1.s); //VELOCITY
	 
	
} //MAIN METHOD BODY CLOSES
} //CLASS BODY CLOSES
