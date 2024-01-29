import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

public class ExcelRead03 {
	public static void main(String[] args) {
		try {

			File file = new File("./FilesData/SampleTestcase_Mpetzone1.xlsx"); // creating a new file instance
			FileInputStream fis = new FileInputStream(file); // obtaining bytes from the file
			// creating Workbook instance that refers to .xlsx file
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0); // creating a Sheet object to retrieve object
			Iterator<Row> itr = sheet.iterator(); // iterating over excel file

			while (itr.hasNext()) {
				Row row = itr.next();
				Iterator<Cell> cellIterator = row.cellIterator(); // iterating over each column
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_STRING: // cell type
						System.out.print(cell.getStringCellValue() + "\t\t\t");
						break;
					case Cell.CELL_TYPE_NUMERIC: // cell type
						System.out.print(cell.getNumericCellValue() + "\t\t");
						break;
					default:
					}
				}
				System.out.println("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

}
