package Starpatterns_NESTED_FOR_LOOPS;

public class D { //user logic class
	
public static void main(String[] args) {//MAIN METHOD STARTS
	
	for(int i=1;i<=3;i++) { //outer for loop ROWS
		for(int j=1;j<=4;j++) //inner for loop COLUMNS
		{
			if(i==1||i==3||j==1||j==4) {
				System.out.print("*");
			        }
			else {
				System.out.print(" ");
			     }
		} //inner for loop ends
		System.out.println();
	} //outer for loop ends
		
}//MAIN METHOD ENDS

}//user logic class endss
