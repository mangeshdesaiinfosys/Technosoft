package InternalMockPractice;

public class prime { //user logic class
	
public static void main(String[] args) { //main method
	
	int num=5;
	int count=0;
	
	for(int i=1;i<=num;i++) {
		
		if(num%i==0) {
			count++;
		}
	}
		if(count==2) {
			System.out.println("PRIME NUMBER");
		}
		
		else {
			System.out.println("NOT PRIME NUMBER");
		}
	
	
}

}
