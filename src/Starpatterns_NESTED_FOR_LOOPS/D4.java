package Starpatterns_NESTED_FOR_LOOPS;

public class D4 { //ULC
	
public static void main(String[] args) {
	for(int i=1;i<=4;i++) { //outer for loop ROWS
		
		for(int j=1;j<=8;j++) { //inner for loop COLUMNS
			if(i==1 && j==1){
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
		
	}
	
	
	
	
}

}
