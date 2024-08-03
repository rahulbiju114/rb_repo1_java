package a1_inheritance;

public class Prg27B extends Prg27A{
	
public void sub() {
		
		int sub = a+b;
		System.out.println("The sub is "+ sub);
		
	}

	public static void main(String[] args) {
		
		Prg27B b = new Prg27B();
		b.add();
		b.sub();

	}

}
