package Starpatterns2;

public class Demo4 {
public static void main(String[] args) {//main method

	int star=5;
	int space=0;
	
 for(int i=1;i<=5;i++)	{ //outer loop ROWS
	 
	 for(int j=1;j<=space;j++) {
		 System.out.print(" ");
           	 }
	 for(int j=1;j<=star;j++) {
		 System.out.print("*");
	 }
	 System.out.println();
	 star--;
	 space++;
	 
 }//OUTER LOOP CLOSES
	
	
	
	
	
	
	
	
	}//main method closes

}//class body closes
