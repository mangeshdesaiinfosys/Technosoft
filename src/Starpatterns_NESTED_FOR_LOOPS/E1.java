package Starpatterns_NESTED_FOR_LOOPS;
public class E1 { //user logic class

public static void main (String []args){ //MAIN METHOD

  for(int i=1;i<=5;i++) //outer loop starts
    {
      for(int j=1;j<=5;j++) //inner loop starts
       {
         if(i==j){
             System.out.print("*");      
                 }
         else{
             System.out.print(" ");
              }
        } //inner loop ends

        System.out.println();

     } ///outer loop ends

}
} 
