package static_nonstatic_variables;

public class Test {// class body open
	
	static int i=20; // static global variable
	int j=40;    //Non static global variable
	int k=1111;  //non static global variable
	
public static void main(String[] args) { //Main method body open

	System.out.println(i);
	
	Test t=new Test(); //OBJECT CREATION
	System.out.println(t.j);
	System.out.println(t.k);
  
	

} //main method body closes

	


}  //class body closes
