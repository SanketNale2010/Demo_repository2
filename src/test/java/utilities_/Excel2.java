package utilities_;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Excel2 {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("C:\\Users\\sankesan\\Desktop\\sanket\\StudentData.xlsx"));
            Workbook workbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                for (Cell cell : row) {
                    // Determine the cell type and get the value accordingly
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

            workbook.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

