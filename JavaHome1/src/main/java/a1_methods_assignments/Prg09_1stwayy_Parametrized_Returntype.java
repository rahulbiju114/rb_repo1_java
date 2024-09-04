// 1nd way - Assignment 2

package a1_methods_assignments;

public class Prg09_1stwayy_Parametrized_Returntype {
	
	static int a;
	static int b;
	
	public static int add(int c, int d) {
		
		a=c;
		b=d;
		
		int sum = a+b;
		return sum;
		
		
		
	}

	public static void main(String[] args) {
		
		
		int x = Prg09_1stwayy_Parametrized_Returntype.add(10, 10);
		System.out.println(x);
		

	}

}