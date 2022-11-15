package Constructor_Designing;

public class Guns {//CLASS BODY STARTS
	
	String gunName;
	int noOfBullets;
	
 public Guns(String gunName,int noOfBullets) //Constructor Design
  {
	 this.gunName=gunName;
	 this.noOfBullets=noOfBullets;
  }

  public void shoot()
  {
	  for(int i=1;i<=noOfBullets;i++)
	  {
		  System.out.println("Dheshhkew");
		  System.out.println("AK47");
	  }
	  
  }//
  
}
