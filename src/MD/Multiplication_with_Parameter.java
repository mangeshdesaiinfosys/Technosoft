package MD;
public class Multiplication_with_Parameter { //CLASS BODY STARTS

	public static void main(String[] args) { //MAIN METHOD BODY STARTS
		multiplication(100,10,10);
		System.out.println("MULTIPLICATION OF 10,10 & 100");
		
	} //MAIN METHOD ENDS
	
	public static void multiplication(int a,int b,int c) {
		int d=a*b*c;
		System.out.println(d);
	}
}
