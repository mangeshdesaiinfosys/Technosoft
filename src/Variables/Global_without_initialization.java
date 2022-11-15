package Variables;

public class Global_without_initialization { //CLASS BODY OPRNS
	static byte b;
	static short s;
	static int i;
	static long l;
	static double d;  //GLOBAL STATIC VARIABLES WITHOUT INITIALIZATION
	static float f;    // ONLY DECLARATION
	static char ch;
	static boolean g;
	static String v;

public static void main(String[]args) { //MAIN METHOD BODY OPENS
	
	System.out.println(b); //0
	System.out.println(s); //0
	System.out.println(i); //0
	System.out.println(l); //0
	System.out.println(d); //0.0
	System.out.println(f); //0.0
	System.out.println(ch); //EMPTY BOX
	System.out.println(g); //FALSE
	System.out.println(v); //NULL
}

}
