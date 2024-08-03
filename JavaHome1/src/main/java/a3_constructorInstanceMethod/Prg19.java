package a3_constructorInstanceMethod;

public class Prg19 {
	
//	static String name;
//	static int age;
//	static String place;
	static String companyName = "IBM";
	
	public void details(String name,int age , String place) {
		
//		name = a;
//		age = b;
//		place = c;
		
		System.out.println("Name :"+name+ "Age :"+age+ "Place :"+place+ "Company Name :"+companyName);
		
		
	}

	public static void main(String[] args) {
		
		Prg19 obj = new Prg19();
		obj.details("Rahul", 24, "Tvm");
		
		Prg19 obj1 = new Prg19();
		obj1.details("Rohan", 33, "Kottyam");

	}

}
