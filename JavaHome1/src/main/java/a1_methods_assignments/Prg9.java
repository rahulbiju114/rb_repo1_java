// 1nd way - Assignment 2

package a1_methods_assignments;

public class Prg9 {
	
	static int a;
	static int b;
	
	public static int add(int c, int d) {
		
		a=c;
		b=d;
		
		int sum = a+b;
		return sum;
		
		
		
	}

	public static void main(String[] args) {
		
		
		int x = Prg9.add(10, 10);
		System.out.println(x);
		

	}

}