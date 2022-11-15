package Constructor_Designing;

public class B_Guns { //CLASS BODY
	
	String gunName;
	int noOfBullets;
	
public B_Guns(String gunName, int noOfBullets)	 { //CONSTRUCTOR DESIGN
	
	this.gunName=gunName;  //Parameterized Constructor
	this.noOfBullets=noOfBullets;
	
}
 public void shoot() {
	 for(int i=1;i<=noOfBullets;i++)
	 {
		 System.out.println("dishkew");
		 System.out.println("AK100");
	 }
		 
		 
 }



}
