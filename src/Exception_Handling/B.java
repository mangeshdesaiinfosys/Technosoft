package Exception_Handling;

public class B { //user logic class
	public static void main(String[] args) throws Throwable  { //main method
		
		int a=111;
		int b=0;
		
		//we write risk code in try block
		
	try {
		int c=a/b;
	}
		//we write exception in catch block
	
	catch(RuntimeException Z) {
		
		System.out.println("ENTER VALID DENOMINATOR ");
		System.out.println("Exception Handelled");
		System.out.println("no exception will show in console window now");
		
		
	}
		
		Thread.sleep(3000);
	} 

}
