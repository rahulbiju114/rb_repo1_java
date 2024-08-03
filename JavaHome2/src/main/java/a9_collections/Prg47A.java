//ArrayList
//Generic form
package a9_collections;

import java.util.ArrayList;

public class Prg47A {

	public static void main(String[] args) {
		
		ArrayList<Integer> obj = new ArrayList<Integer>();
		
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		
		System.out.println("The List = " +obj);
		
		obj.add(60);
		System.out.println("The Updates List = " +obj);
		
		int obj2 = obj.size();
		System.out.println("The size is " +obj2);
		
		//a.get(2);
		System.out.println(obj.get(2));
		
		obj.remove(2);
		System.out.println("The removed list is"+obj);
		
		boolean obj3 = obj.contains(50);
		System.out.println(obj3);
		
		boolean obj4 = obj.contains(100);
		System.out.println(obj4);
		
		//////////////////////////////////////
		
		ArrayList<Integer> d = new ArrayList<Integer>();
		d.add(10);
		d.add(11);
		d.add(12);
		d.add(18);
		
		
		System.out.println("The new List = " +d);
		
		d.addAll(obj);
		System.out.println(d);  // merge both array
		
		d.removeAll(d);
		System.out.println(d);
		
		

		
		

	}

}
