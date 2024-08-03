package a10_exel;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Prg52A {
	

	public static void main(String[] args) {
		
		readXLSXFile("C:\\Users\\rahul\\Desktop\\Obsqura\\JAVA\\Notes\\Jvexel.xlsx");
		

	}

	private static void readXLSXFile(String file1) {
		
		try {
			XSSFWorkbook work1 = new XSSFWorkbook(new FileInputStream(file1));
			
			XSSFSheet sheet1 = work1.getSheet("Customer1");
			
		// For printing 1 	=> Customer id : : 101.0
		//	XSSFRow row1 = sheet1.getRow(0);
		//	System.out.println("Customer id : : "+row1.getCell(0).getNumericCellValue());
			
			
			// Give itreation
			XSSFRow row1 = null;
			int i=0;
			
			while((row1 = sheet1.getRow(i)) != null) {
				
				System.out.println("Customer id : : "+row1.getCell(0).getNumericCellValue());
				System.out.println("Customer name : : "+row1.getCell(1).getStringCellValue());
				System.out.println("Customer no : : "+row1.getCell(2).getNumericCellValue());
				System.out.println("Customer pan : : "+row1.getCell(3).getNumericCellValue());
				System.out.println("");
				i++;
				
			}
			
		}
		
		
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
