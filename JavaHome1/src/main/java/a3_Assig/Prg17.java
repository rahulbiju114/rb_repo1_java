// Write a program to find the
//  Average of three integer numbers, three float numbers(should have same method name) 



package a3_Assig;

public class Prg17 {
	
	public void avg(int a ,int b, int c) {
		
		int avg = (a+b+c)/2;
		System.out.println("Int avg = "+avg);
	}
	
	public void avg(float a ,float b, float c) {
		
		float avg = (a+b+c)/2;
		System.out.println("Float avg = "+avg);
	}
	
	

	public static void main(String[] args) {
		
			Prg17 obj1 = new Prg17();
			obj1.avg(10, 20, 30);
			obj1.avg(10.5f, 20.5f, 30.5f);
			
	}

}
