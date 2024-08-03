package a1_methods;

public class Prg2 {
	
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
		
		Prg2.add();
		Prg2.sub();
		Prg2.mul();
		Prg2.div();
		
	}
	
}
