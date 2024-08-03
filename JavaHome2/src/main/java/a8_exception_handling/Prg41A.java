package a8_exception_handling;

public class Prg41A {
	
	
	//method
	
	public static void getInt() {
		
		int a = Integer.parseInt("pants");    ///--->
		
		
	}
	
	

	public static void main(String[] args) {


		
		try {
		
				getInt();   ////--->
		}
		
		catch (NumberFormatException nfe) {
			
			System.out.println("No exception will occur");
			
		}
		
		System.out.println("Ends here"); 
		
		
		
	}

}
