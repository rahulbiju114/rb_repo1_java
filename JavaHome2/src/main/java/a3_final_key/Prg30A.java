package a3_final_key;

public class Prg30A {
	
	final int a = 10;   /// final variable

	public Prg30A() {
		
		int a =6;                         /// using constructor we can change the value but not good paractice
		System.out.println(a);
		
	}

	public static void main(String[] args) {
		
			Prg30A p = new Prg30A();
	}

}
