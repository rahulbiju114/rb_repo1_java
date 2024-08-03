// multiple try catch


package a8_exception_handling;

public class Prg42A {

	public static void main(String[] args) {

		
		try {
		
		int a = Integer.parseInt("pants");  
		
		}
		
		
		catch (NumberFormatException nfe) {
			
			System.out.println("No nfe exception will occur");
			
		}
		
		
		catch (NullPointerException npe) {
			
			System.out.println("No npe exception will occur");
			
		}
		
		
		System.out.println("Ends here"); 
		
		
//		2nd way
		
//		try {
//			
//			int a = Integer.parseInt("pants");  
//			
//			}
//			
//			
//			catch (NumberFormatException nfe | (NullPointerException npe) {
//				
//				System.out.println("No nfe and npe exception will occur");
//				
//			}
//		System.out.println("Ends here"); 
		
		
	}

}
