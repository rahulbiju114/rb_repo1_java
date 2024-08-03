package a3_constructorInstanceMethod;

public class Prg23 {

	public Prg23() {
		
		this(10,20);
		
		System.out.println("Hello");
		System.out.println();
	}
	
	public Prg23(int a , int b) {
		
	//	this();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(); 
		
		

	}

	public static void main(String[] args) {
		
		Prg23 obj1 = new Prg23();
		Prg23 obj2 = new Prg23(10,20);

	}

}
