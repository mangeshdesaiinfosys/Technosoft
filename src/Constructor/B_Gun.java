package Constructor;

public class B_Gun { //CLASS BODY STARTS
	int noOfBullets;
	String gunName;  //NON STATIC GLOBAL VARIABLE
	
	public void shooting() {  //NON STATIC REGULAR METHOD
		for(int i=1;i<=noOfBullets;i++)
		{
		       System.out.println("DISHOOM DISHOOM");
		}
		
	} //REGULAR METHOD BODY ENDS

} //CLASS BODY ENDS
