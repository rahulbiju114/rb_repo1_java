package a3_constructorInstanceMethod;

public class Prg14 {
	
	
	
	public void add(int a , int b) {
		
		int sum = a+b;
		System.out.println("The sum is " +sum);
		
	}

	public static void main(String[] args) {
		
		
		Prg14 obj = new Prg14();
		
		obj.add(10,10);
		

	}

}
