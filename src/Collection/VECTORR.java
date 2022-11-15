package Collection;

import java.util.Vector;

public class VECTORR { //USER LOGIC CLASS
	
public static void main(String[] args) { //MAIN METHOD
	
 Vector v=new Vector();
 
 v.add("GANESH");
 v.add("VAKRATUND");
 v.add(100);
 v.add('A');
 v.add(100); //duplicate allows
 v.add(null);
 v.add(null);//duplicate null allowed
	//to print all data
 System.out.println(v);
 
 //to check size
 System.out.println(v.size());
 
 //to check empty or not
 System.out.println(v.isEmpty());
 
 //insertion operation
  v.add(3,1111);
 System.out.println(v); //right shift
 
 v.remove(3);
 System.out.println(v);//left shift
 
 
}

}
