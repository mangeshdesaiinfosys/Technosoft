package Starpatterns2;

public class pyramid2 { //user logic class
	
public static void main(String[] args) {
	int star=1;
	
	for(int i=1;i<=9;i++) { //outer loop
		
		for(int j=1;j<=star;j++) { //inner loop
			System.out.print("*");
		}
		
		System.out.println();
		if(i<=4) {
			star++;
		}
		else {
			star--;
		}
	} //outer loop closes
	
	} 

}
