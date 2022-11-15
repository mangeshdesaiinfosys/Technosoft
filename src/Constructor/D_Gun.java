package Constructor;

public class D_Gun { //CLASS BODY STARTSS
	
	String gunName;
	long noOfBullets; //NON STATIC GLOBAL VARIABLE
	
public void shooting() {//NON STATIC REGULAR METHOD

	for(long l=1;l<=noOfBullets;l++)
	        {
	           System.out.println("DHISHOOOOM");
	        }
}// REGULAR METHOD ENDS 
} //CLASS BODY ENDSS
