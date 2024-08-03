package a6_interface;

public class Prg39C implements Prg39A , Prg39B {

	public static void main(String[] args) {
		
		Prg39C obj = new Prg39C();
		
		obj.disp();
		obj.disp1();

	}

	@Override
	public void disp1() {
		
		System.out.println("Print Prg39B");
		
	}

	@Override
	public void disp() {
		
		System.out.println("Print Prg39A");
		
	}

}
