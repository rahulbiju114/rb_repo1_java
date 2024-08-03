package a6_interface;

public class Prg38B implements Prg38A {

	public static void main(String[] args) {
		
		
		Prg38B obj = new Prg38B();
		obj.disp();
		

	}

	@Override
	public void disp() {
		
		int sum = a+b+c;
		
		System.out.println("The sum is :"+sum);
		
	}

}
