// Non generic

package a9_collections;

import java.util.ArrayList;
import java.util.List;

public class Prg51A {

	public static void main(String[] args) {
		
		////////////////////////////////
	
		List obj1 = new ArrayList();
		obj1.add("Hello");
		String s = (String) obj1.get(0);  // Type casting is required
		
		System.out.println(s);
		
		
		////////////////////////////////
		
		ArrayList my_list = new ArrayList();
	      my_list.add("Joe");
	      my_list.add("Rob");
	      my_list.add("Nate");
	      my_list.add("Bill");
	      String s1 = (String)my_list.get(0);
	      String s2 = (String)my_list.get(1);
	      String s3 = (String)my_list.get(3);
	      System.out.println(" ");
	      System.out.println(s1);
	      System.out.println(s2);
	      System.out.println(s3);
	     
	      
	     //////////////////////////////////
	      
	      ArrayList obj = new ArrayList();
			
			obj.add(10);
			obj.add(20);
			obj.add(30);
			obj.add(40);
			obj.add(50);
			
			System.out.println(" ");
			System.out.println("The List = " +obj);
			
			obj.add(60);
			System.out.println("The Updates List = " +obj);
			
			int obj2 = obj.size();
			System.out.println("The size is " +obj2);
			
			//a.get(2);
			System.out.println(obj.get(2));
			
			obj.remove(2);
			System.out.println("The removed list is"+obj);
			
	   }
	}
	

	
	
