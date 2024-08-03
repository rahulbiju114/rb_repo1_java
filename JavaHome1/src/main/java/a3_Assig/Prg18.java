// Instance method overriding

// // Area of figures(circle, rectangle, square) by using three methods(should have same method name)

package a3_Assig;

public class Prg18 {
	
	public void Area(int l ,int b) {
		
		int area = l*b;
		System.out.println("Area of rectangle is " +area);
		
	}
	
	public void Area(int l ) {
		
		int area = l*l;
		System.out.println("Area of square is " +area);
		
	}

	public void Area(double r) {
	
		double area = 3.14*r*r;
		System.out.println("Area of circle is " +area);
	
}
	
	
	

	public static void main(String[] args) {
	
		Prg18 obj = new Prg18();
		obj.Area(3.3);
		obj.Area(2);
		obj.Area(10, 10);

	}

}
