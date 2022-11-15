package SIB;

public class EXECUTION { //CLASS BODY STARTS
public static void main(String args[]) {//MAIN BODY STARTS
	System.out.println("Hii GOOD MORNING");
	System.out.println("MAIN METHOD STARTED");
	
	System.out.println("FIRST");
    System.out.println("SECOND");
     System.out.println("THIRD");
     
     EXECUTION Y=new EXECUTION(); //OBJECT CREATION
	System.out.println(Y); //ADDRESS OF OBJECT 
	
	
	System.out.println("MAIN METHOD ENDED");
} //MAIN METHOD ENDS
   
 static { //STATIC INITIALIZER BLOCK STARTED
	 System.out.println("i will execute before MAIN");
	 System.out.println("FIRST SIB, THEN MAIN METHOD");
	 
	 EXECUTION X=new EXECUTION(); //OBJECT CREATED
	 System.out.println(X); //ADDRESS OF OBJECT
         } //SIB ENDS

}//CLASS BODY ENDS
