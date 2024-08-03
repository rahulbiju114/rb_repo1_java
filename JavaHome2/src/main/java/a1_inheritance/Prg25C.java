package a1_inheritance;

public class Prg25C extends Prg25B {
	
	public void classC() {
		
		System.out.println("Print Child2");
		
	}

	public static void main(String[] args) {
		
		Prg25C c1 = new Prg25C();
		
		c1.classA();
		c1.classB();
		c1.classC();   
		
		

	}

}
