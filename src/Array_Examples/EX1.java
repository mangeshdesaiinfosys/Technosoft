package Array_Examples;

public class EX1 { //user logic class
	
public static void main(String[] args) { //main method
	
	String ar[]=new String[5];
	ar[0]="MAHADEV";
	ar[1]="SHIV";
	ar[2]="SHAMBHU";
	ar[3]="SHANKAR";
	ar[4]="NEELKANTH";
	
	//System.out.println(ar[0]);  //MAHADEV
	
	//System.out.println(ar[1]); //SHIV
	
	
	//i want to print all strings
	
	for(int i=0;i<=4;i++) {
		System.out.print( "  " +ar[i]);
	}
	
}

}
