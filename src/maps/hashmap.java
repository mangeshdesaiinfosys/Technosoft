package maps;

import java.util.HashMap;

public class hashmap { //user logic class
	
public static void main(String[] args) { //main method
	
	HashMap<Integer, String> hm=new 	HashMap<Integer, String>();
	
	hm.put(null, "SHIV");
	hm.put(null, "SHANKAR");
	hm.put(2, "GOURISH");
	hm.put(3, null); //accept only one key as null
	hm.put(4, null); //but accepts multiple null values
	hm.put(5,"BHOLENATH");
	
	//to print all data
	System.out.println(hm);

	//to print doubly
	//System.out.println(hm.clone());
	 System.out.println("i'm pushed to Github from Eclipse");
	
	//to get size
	//System.out.println(hm.size());
	
	//to check empty or not
	//System.out.println(hm.isEmpty());
	
	//to remove
	///hm.remove(4);
	//System.out.println(hm);
}

}
