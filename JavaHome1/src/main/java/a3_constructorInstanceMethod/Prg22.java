package a3_constructorInstanceMethod;

public class Prg22 {
	
int x;   // static not needed  // this is used
int y;
	
	public Prg22(int a ,int b) {
		
		this.disp();
		
		this.x =a;   
		this.y =b;
		
		this.disp();
		
		this.disp(10,20);
	}
	
	
	public void disp() {
	
		System.out.println(x);
		System.out.println(y);
		
		System.out.println();
	}
	
	public void disp(int s , int v) {
		
		this.disp();
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println();
	}

	public static void main(String[] args) {
		
		Prg22 obj = new Prg22(10,20);
		
		
	}

}