package a1_methods;

public class Prg10_Static_MethodOverloading {
	
	
	public static void disp() {
		
		System.out.println("Print 1");
		
	}
	
	public static void disp(int a) {
		
		System.out.println("Print 10");
		
	}


	public static void disp(int a, int b) {
	
	System.out.println("Print 2");
	
}

	public static void disp(String x , int c) {
	
	System.out.println("Print 3");
	
}
	
	

	public static void main(String[] args) {
		
		Prg10_Static_MethodOverloading.disp();
		Prg10_Static_MethodOverloading.disp(10);
		Prg10_Static_MethodOverloading.disp(10,20);
		Prg10_Static_MethodOverloading.disp("rahul",20);
		

	}

}
