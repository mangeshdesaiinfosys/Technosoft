package Constructor_Designing;

public class c_guns { //BLC
	
	String gunName;
	int noOfBullets;
	
	
 public c_guns(String gunName, int noOfBullets) { //CONSTRUCTOR DESIGN
	 this.gunName=gunName;
	 this.noOfBullets=noOfBullets;
	 
 }
	public void shoot() {
		
		for(int i=1; i<=noOfBullets;i++) {
			
			System.out.println("DISSSHKEWWW");
			System.out.println("AK56");
		       }
		
	}

}
