package Exception_Handling;

public class SIOBE { //user logic class
	
public static void main(String[] args) throws Throwable { //main method
	
	String s1="velocity";
	
	
	try {
		System.out.println(s1.charAt(8));
	}
	
	catch(StringIndexOutOfBoundsException m) {
		System.out.println("There is no data you trying to fetch");
		System.out.println("hello");
	}
	Thread.sleep(10000);
	System.out.println("Java programming");
}

}
