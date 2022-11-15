package static_nonstatic_variables;

public class Dimple {//class body open
	int k=11;
	static int i=111; //global static variable
	long l=31827953679l;
	public static void main(String []args) {// main method body open
		System.out.println(i); //111
		
		 Dimple d=new Dimple(); //OBJECT CREATION
		 System.out.println(d.k); //11
		 System.out.println(d.l); //31827953679
		 
	} //main method body closes
	
	

} //class body closes
