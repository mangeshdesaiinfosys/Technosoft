package static_nonstatic_variables;

public class Abc {//class body opens
	
    static int k=55; //GLOBAL STATIC VARIABLE
           int m=11; //GLOBAL NON STATIC VARIABLE
           
public static void main(String[]args) {//method body opens
	
	System.out.println(k); //55
	
	Abc x=new Abc();//object creation
	System.out.println(x.m);



	
}


}
