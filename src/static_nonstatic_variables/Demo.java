package static_nonstatic_variables;

public class Demo { //CLASS BODY OPENS
	
	static String s="VELOCITY";
	String s1="ANKUSH SIR";
	String s2="Everyone in this Materialistic World is frustrated";
	String s3="Hare Krishna";
	String s4="HAR HAR MAHADEV";
	
public static void main (String[]args) { // METHOD BODY OPENS
	 System.out.println(s);
    
	 Demo d=new Demo();
	 System.out.println(d.s1);
	 System.out.println(d.s2);
	 System.out.println(d.s3);
	 System.out.println(d.s4);
	 
}
}
