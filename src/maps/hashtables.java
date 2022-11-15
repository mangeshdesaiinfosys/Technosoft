package maps;

import java.util.Hashtable;

public class hashtables { //user logic class
	
public static void main(String[] args) { //main method
	
	Hashtable<Integer, String> t=new Hashtable<Integer,String>();
	
	t.put(1, "KRISHNA");
	t.put(2, "KANHA");
	t.put(3, "GOVINDA");
	t.put(4, "HARI");
	
	//TO PRINT ALL DATA
	System.out.println(t);
	
	//TO REMOVE ANY ONE OF ENTRY
	t.remove(2);
	System.out.println(t);
	
	//to get size
	System.out.println(t.size());
	
	//to check empty or not
	System.out.println(t.isEmpty());
	
	//to clone
	System.out.println(t.clone());
		
}

}
