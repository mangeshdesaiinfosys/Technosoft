package Starpatterns_NESTED_FOR_LOOPS;

public class C { //user logic class
	
public static void main(String[] args) {//main method starts
	
	//more than 2 set of operations if else ladder inside for loop
	
for(int i=1;i<=4;i++) //rows OUTER FOR LOOP
{
  for(int j=1;j<=4;j++) //columns INNER FOR LOOP
  {
	  if(i==1 && j==1) {
		  System.out.print("@");
	                 }
	  else if(i==4 && j==4) {
		  System.out.print("#");
	  }
	  else {
		  System.out.print("*");
	  }
  } //inner for loop ends
	 System.out.println(); //for moving next line
	  
}//outer for loop ends
 
}//MAIN METHOD ENDS
}  
