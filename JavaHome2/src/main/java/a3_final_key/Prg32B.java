package a3_final_key;

public class Prg32B extends Prg32A {
	
	final int a = 10;   

	public final void disp() {     /// final methods cannot be override
		
		System.out.println("Print CLASS 1");
		
	}
	
	public static void main(String[] args) {
		
			Prg32B obj = new Prg32B();
			
			System.out.println(obj.a);
	}

}
