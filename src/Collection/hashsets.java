package Collection;

import java.util.HashSet;

public class hashsets { //user logic class
	
public static void main(String[] args) { //main method
	
	HashSet hs=new HashSet();
	hs.add("ANKUSH");
	hs.add(100);
	hs.add('A');
	hs.add(null); //allow only one null value
	hs.add(null);
	hs.add(100); //dont allow duplicate only compilation no execution
	
	//to print entire data
	System.out.println(hs);
	
	//to know size
	System.out.println(hs.size());
	
	//to check whether empty or not
	System.out.println(hs.isEmpty());
	
	//to clear entire data
	hs.clear();
	System.out.println(hs);
	
}

}
