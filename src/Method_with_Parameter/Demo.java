package Method_with_Parameter;

public class Demo { //CLASS BODY STARTS
	
public static void main(String[] args) { //MAIN METHOD STARTS
	addition(111.111,11); // COMPILE TIME BINDING
	
	System.out.println("addition of two numbers");
	
}//MAIN METHOD ENDS

public static void addition(double a, int b) {
	double c=a+b;
	
	System.out.println(c);
}

} //CLASS BODY ENDS
