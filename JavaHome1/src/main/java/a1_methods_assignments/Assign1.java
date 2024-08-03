package a1_methods_assignments;

public class Assign1 {
	
	
	public static int a = 10;
	public static int b=5;
	
	public static int sum;
	public static int avg;
	
	
	public static void add() {
		
		// int sum = a+b; // local variable not used
		
		Assign1.sum = a+b;
		
	}
	
	
	public static void avg() {
		
		
		 avg = sum/2;
		 
		 System.out.println("Print sum ="+ sum);
		 
		 System.out.println("Print Avg ="+ avg);
		
	}
	
	

	public static void main(String[] args) {
		
		Assign1.avg();
		
		

	}

}
