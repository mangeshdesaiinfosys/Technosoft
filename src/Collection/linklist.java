package Collection;

import java.util.LinkedList;

public class linklist { //user logic class
	
public static void main(String[] args) { //main method
	
	LinkedList ll=new LinkedList();
	
	ll.add(10);
	ll.add(20);
	ll.add(30);
	ll.add(40);
	ll.add(20);
	ll.add(10);
	ll.add(10);
	
	//to print entire data
	System.out.println(ll);
	
	//to get size
	//System.out.println(ll.size());
	
	//to check empty or not
	//System.out.println(ll.isEmpty());

	//insertion operation RIGHT SHIFT
	//ll.add(1,"SURESH");
	//System.out.println(ll);
	
	//deletion operation LEFT SHIFT
	//ll.remove(1);
	//System.out.println(ll);
	ll.remove(3);
	ll.remove(4);
	ll.remove(5);
	System.out.println(ll);
}
}
	
	
	
	
	
	
	
	



