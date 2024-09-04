package a1_methods;

public class Prg02 {
	
	static int a =10;
	static int b =20;
	static int c;
	
	
	public static void add() {
		
		c =a+b;
		System.out.println("Addition is =" +c);
		
	}
	
	public static void div() {
		
		c =a%b;
		System.out.println("Divisionn is =" +c);
		
	}
	
	public static void sub() {
		
		c =a-b;
		System.out.println("Substraction is =" +c);
		
	}
	
	public static void mul() {
		
		c =a*b;
		System.out.println("Multiplication is =" +c);
		
	}
	
	public static void main(String[] args) {
		
		add();  // class name not needed - main static
		Prg02.sub();
		Prg02.mul();
		Prg02.div();
		
	}
	
}
