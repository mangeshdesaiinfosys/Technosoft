package Collection;

import java.util.LinkedHashSet;

public class linkedhashsetss { //USER LOGIC CLASS
	
public static void main(String[] args) { //MAIN METHOD
	
	LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("RINKY");
	lhs.add(100);
	lhs.add('A');
	lhs.add(100);
	lhs.add(null);
	lhs.add(null);
	
	//to print entire data
	System.out.println(lhs);
	
	//to get size
	System.out.println(lhs.size()); 
	
	//to check whether empty or not
	System.out.println(lhs.isEmpty());
	
	
}

}
