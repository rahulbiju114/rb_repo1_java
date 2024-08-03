package a3_constructorInstanceMethod;

public class Prg15 {
	
	public int sum;
	
	
	public Prg15(int a ,int b) {
		
	 sum = a+b;
		
		
	}
	
	public void avg() {
		
		int avg = sum/2;
		System.out.println("The avg is "+avg);
		
		
	}

	public static void main(String[] args) {
		
		Prg15 obj = new Prg15(10,20);
		obj.avg();
		
		
		
	}

}
