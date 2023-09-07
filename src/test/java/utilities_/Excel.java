package utilities_;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

	
public class Excel {
	public static void main(String args[]) throws IOException {
        //obtaining input bytes from a file  
		FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\sankesan\\Desktop\\sanket\\StudentData.xlsx"));
          //creating workbook instance that refers to .xls file  
		Workbook workbook = new XSSFWorkbook(fileInputStream); // For .xlsx files
	
        //creating a Sheet object to retrieve the object  
		Sheet sheet = workbook.getSheetAt(0); // Get the first sheet (index 0)
	
        //evaluating cell type   
		
		for (Row row : sheet) {
		    for (Cell cell : row) {
		        // Access the cell value based on its data type
		        switch (cell.getCellType()) {
		            case STRING:
		                String cellValue = cell.getStringCellValue();
		                System.out.print(cellValue + "\t");
		                break;
		            case NUMERIC:
		                double numericValue = cell.getNumericCellValue();
		                System.out.print(numericValue + "\t");
		                break;
		            case BOOLEAN:
		                boolean booleanValue = cell.getBooleanCellValue();
		                System.out.print(booleanValue + "\t");
		                break;
		            // Handle other cell types as needed
		        }
		    }
		    System.out.println(); // Move to the next row
		}

	}
}