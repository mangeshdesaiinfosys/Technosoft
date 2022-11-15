package Collection;

import java.util.ArrayList;

public class ARRRAYLIST { //user logic class
	
public static void main(String[] args) { //main method
	
	ArrayList al=new ArrayList();
	
	al.add("ANKUSH");
	al.add(100);
	al.add('A');
	al.add(100); //duplicate allows
	al.add(null);
	al.add(null);
	
	//to print all data
	System.out.println(al);
	
	//to check or get size
	System.out.println(al.size()); ///6  
	
	//to check empty or not
	System.out.println(al.isEmpty()); //false
	
	//insertion operation
   al.add(3,111);
   System.out.println(al);
   
   //remove operation
   al.remove(3);
   System.out.println(al);
	
}

}
