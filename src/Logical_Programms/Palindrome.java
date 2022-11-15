package Logical_Programms;

public class Palindrome { //user logic class
	
public static void main(String[] args) { //main method
	
	String org="ROTATOR";
	String rev="";
	
	
      for(int i=org.length()-1;i>=0;i--) {
    	  rev=rev+org.charAt(i);
      }
      
      System.out.println(rev);
      
	if(org.equals(rev)) {
		System.out.println("PALINDROME");
	}
	else {
		System.out.println("NOT PALINDROME");
	}
}

}