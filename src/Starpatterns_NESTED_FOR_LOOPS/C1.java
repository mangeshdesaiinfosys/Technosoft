package Starpatterns_NESTED_FOR_LOOPS;

public class C1 { //user logic class

public static void main(String[] args) { //MAIN METHOD
	
	//here we are using nested if else because of 3 no's of operation

 for(int i=1;i<=4;i++) //outer for loop
  {
    for(int j=1;j<=4;j++) { //inner for loop
                
           if(i==1 && j==1)
                {
                  System.out.print("@");
                }
            else if(i==4 && j==4)
                {
                   System.out.print("#");
                }
            else 
               {
                  System.out.print("*");
                }

                       }// inner loop ends

             System.out.println();
           } //outer loop ends
}//main method ends
}//user logic class ends
