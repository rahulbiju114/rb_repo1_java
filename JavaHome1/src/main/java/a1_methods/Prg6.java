// // Static - with parameterized  

// From the main() -> pass a value -> Assign value as static variable. So this static varaible can be used anywhere.

package a1_methods;

public class Prg6 {
	
	public static String s;
	
	public static void disp(String x) {   // local vraible
		
		s=x;    // Assign local to static
		
		System.out.println(s);
		
	}
	
	public static void disp1() {
		
		System.out.println(s);       // to pass to another method above Static varaible s is print
		
	}
	

	public static void main(String[] args) {
		
		Prg6.disp("Rahul");
		Prg6.disp1();
		
		

	}

}
