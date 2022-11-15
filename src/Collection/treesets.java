package Collection;

import java.util.TreeSet;

public class treesets { //USER  LOGIC CLASS
	
public static void main(String[] args) { //MAIN METHOD
	
	TreeSet t=new TreeSet();
	t.add(800);
	t.add(400);
	t.add(200);
	t.add(100);
	t.add(500);
	t.add(600);
	t.add(700);
	t.add(300);
	
	System.out.println(t);
	
	t.pollLast();
	System.out.println(t);
	
	t.pollFirst();
	System.out.println(t);
	
	System.out.println(t.size()); //to get size
	System.out.println(t.isEmpty());
}

}
