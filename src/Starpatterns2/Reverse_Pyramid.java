package Starpatterns2;

public class Reverse_Pyramid {//user logic class
	public static void main(String[] args) { //main method
          int star=7;
          int space=0;
          
          for(int i=1;i<=4;i++) { //outer for loop for ROWS
        	  for(int j=1;j<=space;j++) {
        		  System.out.print(" ");
        	  }
        	  
        	  for(int j=1;j<=star;j++) {
        		  System.out.print("*");
        	  }
        	  
        	 System.out.println(); 
        	  
        	  space++;
        	  star=star-2;
        	  
        	  
        	  
        	  
        	  
          }//outer loop closes
                   
	}
}
