package Variables;

public class object_creation_global_variable { //CLASS BODY OPEN
	
	static int i=1111; //GLOBAL STATIC VARIABLE
	       
	       int j=20;
	       long l=7721083653l;  //GLOBAL NON STATIC VARIABLE
	       boolean b=true;
	

public static void main(String[]args) { // MAIN METHOD BODY OPEN
	
	   char ch='A';
	   System.out.println(ch); //A Local variable print
	   
	   System.out.println(i); //global static variable print
	   
 object_creation_global_variable w=new object_creation_global_variable(); //OBJECT CREATION
	   
	   System.out.println(w.j);
	   System.out.println(w.l);  //PRINT NON STATIC GLOBAL VARIABLES (i,l,b) THROUGH OBJECT CREATION
	   System.out.println(w.b);
	   
	   } // MAIN METHOD BODY CLOSES

} // CLASS BODY CLOSES
