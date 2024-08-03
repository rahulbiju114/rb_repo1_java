package a8_exception_handling;

public class Prg40A {

	public static void main(String[] args) {


		//int a = Integer.parseInt("1");
		
		try {
		
		int a = Integer.parseInt("pants");  // NumberFormatException
		
		}
		
		
	//	catch (Exception e) {  ----------------------------- imp
		
		catch (NumberFormatException nfe) {
			
			System.out.println("No exception will occur");
			
		}
		
		System.out.println("Ends here"); // give int a = Integer.parseInt("123"); 
		
		
		
	}

}
