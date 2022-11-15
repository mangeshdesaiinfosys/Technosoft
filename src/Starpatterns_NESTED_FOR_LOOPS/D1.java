package Starpatterns_NESTED_FOR_LOOPS;

public class D1{ //user logic class

public static void main(String[] args) { //main method

 for(int i=1;i<=3;i++){ //outer for loop ROWS
 
    for(int j=1;j<=4;j++){ //inner for loop columns
 
        if(i==1||i==3||j==1||j==4){
            System.out.print("*");
                             }
                          
         else{
            System.out.print(" ");
             }
          
                    }//inner for loop ends
   
             System.out.println();
        } //outer loop ends
} //MAIN METHOD CLOSES
}   //ULC ENDS
