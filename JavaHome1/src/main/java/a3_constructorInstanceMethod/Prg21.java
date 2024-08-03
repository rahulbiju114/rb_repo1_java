//Instance method overloading

package a3_constructorInstanceMethod;

public class Prg21 {
	
int x;
int y;
	
	public Prg21(int a ,int b) {
		
		this.x =a;
		this.y =b;
	}
	
	
	public void disp() {
	
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		
		Prg21 obj = new Prg21(10,20);
		obj.disp();
		
	}

}
