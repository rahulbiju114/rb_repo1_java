// finally block 
package a8_exception_handling;

public class Prg43A {

	public static void main(String[] args) {

		
		try {
		
		int a = Integer.parseInt("pants");  
		
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