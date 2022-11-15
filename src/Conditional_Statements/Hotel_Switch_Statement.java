package Conditional_Statements;

public class Hotel_Switch_Statement { //CLASS BODY STARTS
public static void main(String[] args) { //MAIN METHOD STARTED
	
switch("DOSA") {
case "KHEER":{
	System.out.println("ON MONDAY");
	    break;
            }
case "IDLI":{
	System.out.println("ON TUESDAY");
	  break;
            }
case "POHA": {
	System.out.println("ON WEDNSDAY");
	  break;
              }
case "DOSA": {
	System.out.println("ON THURSDAY");
	break;
           }
case "idli": {
	System.out.println("ON FRIDAY");
	 break;
             }
case "MEDUVADA": {
	System.out.println("ON SATURDAY"); 
	break;
            }
case "LEMON RICE":{
	System.out.println("ON SUNDAY");
   break;
                 }
default:{
	System.out.println("NO BREAKFAST");
	break;
        }

              } //SWITCH CLOSES
}//MAIN METHOD CLOSES 
} //CLASS BODY CLOSES