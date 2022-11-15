package static_nonstatic_variables;

public class Sample { // CLASS BODY OPENS
	 
	static int i=10; //Global Static variable
	int j=1; //Global non static variable
	
public static void main(String[]args) { // MAIN METHOD BODY OPENS
	
	System.out.println(i);
	
	Sample s=new Sample(); //OBJECT CREATION
	System.out.println(s.j);

}
}
