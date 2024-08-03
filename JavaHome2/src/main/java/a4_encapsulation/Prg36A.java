// Program to withdraw amount from an ATM 
 
/*  Class 1- Bank One method to set pin from „User‟ class and 
 
 	validate Pin in another method 
 
  	[Valid pins – 1001, 1234, 1212] 
 
 	 Pin number should declared as private 
 
 	 Class 2 – User Get the pin from User*/


package a4_encapsulation;

public class Prg36A {
	
	private int pin;
	
	public void setter(int pin) {
		
		this.pin = pin;
		
	}
	
	public void getter() {
		
		if(pin == 1001) {
			
			System.out.println("It is valid pin");
		}
		
		else if(pin == 1234) {
			
			System.out.println("It is valid pin");
		}
		
		else if(pin == 1212) {
					
			System.out.println("It is valid pin");
		}
		
		else {
			
			System.out.println("Invaild pin");
		}
		
	}
	
	

}
