package a8_exception_handling;

public class Prg44A {

	public static void main(String[] args) {

		
		try {
		
		int a = Integer.parseInt("123");  
		
		System.out.println("After parseInt"); // code wont execute giving .parseInt("pants");  
		
		}
		
		
		catch (NumberFormatException nfe) {
			
			System.out.println("No nfe exception will occur");
			
		}
		
		finally {
			
			System.out.println("in the finally block");
		}
	
		
		System.out.println("Ends here"); 
		
	}
}