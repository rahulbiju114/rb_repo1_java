package a8_exception_handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Prg45A {

	public static void main(String[] args) throws Exception{
		
		int i, j=1,k=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		i=8;
		
		System.out.println("Enter a number");
		
		j= Integer.parseInt(br.readLine());   // exception 
		
		k= i+j;
		
		System.out.println("Out[ut is "+k);

	}

}
