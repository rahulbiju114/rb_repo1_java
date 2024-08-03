package a8_exception_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prg46A {

	public static void main(String[] args) throws Exception{
		
		int i, j=1,k=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		i=8;
		
		try {
		
		System.out.println("Enter a number");
		
		j= Integer.parseInt(br.readLine());   // exception 
		
		k= i+j;
		
		if(k<10) {
			
			throw new ArithmeticException();
			
		}
		
		System.out.println("Output is "+k);
		
		}
		
		catch(IOException e) {
			
			System.out.println("File not found");
			
		}
		
		catch(ArithmeticException ae) {
			
			System.out.println("Minimum value is 10");
			
		}


	}

}
