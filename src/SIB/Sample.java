package SIB;

public class Sample { //CLASS BODY STARTED
public static void main(String[] args) {
	 int i=10;
	 System.out.println(i);
	 Sample s=new Sample();
	 System.out.println(s);
	 
	 Sample s1=new Sample();
	 System.out.println(s1);
}
 static {
	 System.out.println("i will execute before MAIN because i'm SIB");
	  Sample s2=new Sample();
	    System.out.println(s2);
 }
}
