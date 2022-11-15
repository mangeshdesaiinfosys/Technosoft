package Exception_Handling;

public class Finally {
	
public static void main(String[] args) throws Throwable {
	int a=10;
	int b=0;
	
	try {
		System.out.println("i am from try block");
	}
	
	catch(ArithmeticException monkey) {
		System.out.println("ENTER  VALID DENOMINATOR");
		System.out.println("Exception is Handled");
		
	}
	
	finally {
		System.out.println("Thank You for using ATM");
	}
	
	
	
	
Thread.sleep(5000);
	
	
	
}

}
