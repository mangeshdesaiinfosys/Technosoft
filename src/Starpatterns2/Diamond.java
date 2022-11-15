package Starpatterns2;

public class Diamond { //user logic class
	
public static void main(String[] args) { //main method opens
	
	         int star=1;
	         int space=4;
	         
 for(int i=1;i<=9;i++) { //outer for loop ROWS
	  
	 for(int j=1;j<=space;j++) {
		 System.out.print(" ");
	         }
	 for(int j=1;j<=star;j++) {
		 System.out.print("*");
	        }
	 
	 
System.out.println();

     if(i<=4) {
    	 space--;
    	 star=star+2;
     }
     else {
    	 space++;
    	 star=star-2;
     }
 
 }//OUTER FOR LOOP ENDS
		
}//main method ends

}//user logic class ends
