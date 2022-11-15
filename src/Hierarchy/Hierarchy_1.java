package Hierarchy;

public class Hierarchy_1 { //USER LOGIC CLASS
// HIERARCHICLE INHERITANCE: ONLY 1 SUPERCLASS; MULTIPLE SUBCLASSES
public static void main(String[] args) {//MAIN METHOD
	son1 s1=new son1();
	s1.mobile();
	s1.home();
	s1.money();
	System.out.println("PROPERTY OF son1");
	
	son2 s2=new son2();
	s2.bike();
	s2.home();
	s2.money();
	System.out.println("PROPERTY OF son2");
	
	son3 s3=new son3();
	s3.laptop();
	s3.home();
	s3.money();
	System.out.println("PROPERTY OF son3");
	
} //MAIN METHOD ENDS
} //USER LOGIC CLASS ENDS
