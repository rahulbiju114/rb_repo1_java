// Write a program to find the grade of 2 students based on total marks(3 subjects)
//  Get the student‟s marks by constructor 
// Return total mark to in main method
// Find the grade of each student.


package a3_Assig;

public class Prg16 {
	
	public static int x;
	public static int y;
	public static int z;
	
	public Prg16(int a, int b ,int c) {
		
		x=a;
		y=b;
		z=c;
		
	}
	
	public static int total() {
		
		int total = x+y+z;
		return total;
	}

	public static void main(String[] args) {
		
		Prg16 obj1 = new Prg16(10,20,30);
		
		
	//	Prg16 obj2 = new Prg16(5,15,5);
		
		int s = Prg16.total();
		
		System.out.println("The total mark is :" +s);
		
		if(s>40) {
			System.out.println("The grade is A");
		}
		
		else {
			System.out.println("The grade is F");
		}
		
		
	}

}
