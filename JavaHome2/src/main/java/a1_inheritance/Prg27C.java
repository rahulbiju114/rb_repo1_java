package a1_inheritance;

public class Prg27C extends Prg27A{
	
public void mul() {
		
		int mul = a*b;
		System.out.println("The mul is "+ mul);
}

	public static void main(String[] args) {
		

		Prg27C c = new Prg27C();
		c.add();
		c.mul();
		
		//c.sub();

	}

}
