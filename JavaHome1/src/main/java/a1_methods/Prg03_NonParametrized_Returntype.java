// // Static - non parameterized - with return type 

// 1 way - Assign a value and print

package a1_methods;

public class Prg03_NonParametrized_Returntype {
	
	public static String disp() {
		
		String s = "Hello";
		return s;
		
	}

	public static void main(String[] args) {
		
		String x = Prg03_NonParametrized_Returntype.disp();
		System.out.println(x);

	}

}
