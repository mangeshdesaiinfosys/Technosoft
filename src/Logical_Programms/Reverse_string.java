package Logical_Programms;

public class Reverse_string { //user logic class
	
public static void main(String[] args) { //main method
	
	String org="MD";
	String rev=" ";
	//length() it tells total no.of characters in that perticular string
	
      for(int i=org.length()-1;i>=0;i--) {
    	  rev=rev+org.charAt(i);
      }
	System.out.println(rev);
}

}
