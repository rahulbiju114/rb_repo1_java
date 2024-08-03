package a3_constructorInstanceMethod;

public class Prg20 {
	
	static String name;
	static int age;
	static String place;
	static String companyName = "IBM";
	
	public  Prg20(String a ,int b , String c) {
		
		name = a;
		age = b;
		place = c;
		
	}
	
	public void details() {
		
		System.out.println("Name :"+name+ "Age :"+age+ "Place :"+place+ "Company Name :"+companyName);
	}
	
	

	public static void main(String[] args) {
		
		Prg20 obj = new Prg20("Rahul", 24, "Tvm");
		obj.details();
		
		Prg20 obj1 = new Prg20("Rohan", 33, "Kottyam");
		obj1.details();

	}

}