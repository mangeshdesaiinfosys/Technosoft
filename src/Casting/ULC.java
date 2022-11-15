package Casting;

public class ULC {
	
public static void main(String[] args) {
	  //UPCASTING:assigning subclass property to superclass
	//sublass:son , superclass:father
	
	   father s=new son();//object of one class, reference of another class
	   s.money();
	   
	  //regular creating object of subclass 
	   son s1=new son();
	   s1.car();
	   s1.laptop();
	   s1.money();
}

}
