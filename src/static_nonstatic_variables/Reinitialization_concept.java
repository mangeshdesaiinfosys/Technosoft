package static_nonstatic_variables;

public class Reinitialization_concept { //CLASS BODY OPENS
	
	static int k; //GLOBAL STATIC VARIABLE ONLY DECLARATION
	static int m;
	static long l;
	
public static void main(String[]args) { //MAIN METHOD BODY OPENS
	
	// REINITIALIZATION CONCEPT
	
	 int i=10;
	     i=20;
	     i=30;
	     i=51;
	     i=61;
	     i=111111;
	     
	  System.out.println(i); //111111
	  
	  System.out.println(k);  //PRINT GLOBAL VARIABLE WHICH ONLY DECLARED
	  System.out.println(m);
	  System.out.println(l);
	
} //MAIN METHOD BODY CLOSES

} //CLASS BODY CLOSES
