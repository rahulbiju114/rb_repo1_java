// List 


package a9_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Prg48A {

	public static void main(String[] args) {
		
		List<Integer> obj1 = new ArrayList<Integer>();
		
		obj1.add(10);
		obj1.add(20);
		obj1.add(30);
		obj1.add(40);
		obj1.add(50);
		
		System.out.println("print List");
		System.out.println("The list ="+obj1 );
		
		//Using for each
		
		for(int i : obj1) {
			
			System.out.println(" "+i);
		}
		
		Iterator obj2 = obj1.iterator();
		while(obj2.hasNext()) {
			
			System.out.println("");
			System.out.println("Using iterator");
			System.out.println(obj2.next());
		} 
		
		Iterator obj3 = obj1.iterator();
		while(obj3.hasNext()) {
			
			System.out.println(" ");
			System.out.println(obj3.next());
			System.out.println("Removed each element");
			obj3.remove();
			System.out.println(obj1);
			
		} 

	}

}
