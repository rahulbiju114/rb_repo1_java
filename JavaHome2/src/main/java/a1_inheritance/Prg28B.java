package a1_inheritance;

public class Prg28B extends Prg28A {
	
	
	public Prg28B() {
		
		super();
		System.out.println();
		System.out.println("Child Class Constructor");
		System.out.println();
		System.out.println(super.a);
		System.out.println();
		super.add();
		System.out.println();
		
		//super(); - always 1st statement
		
		
	}

	public static void main(String[] args) {
		
		Prg28B p = new Prg28B();
		
		//p.add();

	}

}
