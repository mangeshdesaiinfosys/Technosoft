package Constructor_Designing;

public class A_Guns { //CLASS BODY STARTS
	
 String gunName;
 int noOfBullets;
 
 public A_Guns(String gunName,int noOfBullets) //Constructor Design
       {
	        this.gunName=gunName;
	        this.noOfBullets=noOfBullets;
       }
   
 public void shoot() {
	  for (int i=1;i<=noOfBullets;i++)
	  {
		  System.out.println("Dishkewwww");
		  System.out.println("AK56");
	  }
 }
}
