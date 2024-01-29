package pizzahut.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readDataFromExel {
	public String getUrl(){
		String url="";
		try {

			File file = new File("C:\\Users\\phaldar\\Documents\\apt2-functional-testing\\Projects\\pizzaHutProj\\pizzahut\\src\\main\\java\\pizzahut\\utils\\data.xlsx"); // creating a new file instance
			FileInputStream fis = new FileInputStream(file); // obtaining bytes from the file
			// creating Workbook instance that refers to .xlsx file
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0); // creating a Sheet object to retrieve object
			Iterator<Row> itr = sheet.iterator(); // iterating over excel file
           
			while (itr.hasNext()) {
				int i=0;
				Row row = itr.next();
				Iterator<Cell> cellIterator = row.cellIterator(); // iterating over each column
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					if(i==1)url = cell.getStringCellValue();
					i++;
//					System.out.println("  ");
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return url;
	}

}