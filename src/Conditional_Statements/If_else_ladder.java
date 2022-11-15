package Conditional_Statements;

public class If_else_ladder { //CLASS BODY START
public static void main(String[] args) {
	
             int marks=39;
         if(marks>=75)
         {
        	 System.out.println("Pass with DISTINCTION");
         }
         else if(marks>=60)
         {
	         System.out.println("Pass with FIRST CLASS");
         }
	     else if(marks>=50)
         {
        	 System.out.println("Pass with SECOND CLASS");
         }
	     else if(marks>=40)
         {
        	 System.out.println("JUST PASS");
         }
         else
         {
        	System.out.println("FAIL"); 
         }
         
}
}
