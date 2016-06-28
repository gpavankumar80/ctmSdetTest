package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel
{
	public static String reader(int column, int row, String sheetName) 

	  {
		  String data = "";
		  try
		  {
		  	
		  	File file = new File("testdata\\testdata.xls");
		  	jxl.Workbook workbook = jxl.Workbook.getWorkbook(file);
		  	jxl.Sheet sheet = workbook.getSheet(sheetName);
		  	 jxl.Cell cell = sheet.getCell(column, row);
		    data = cell.getContents();
		  	
		  }
		  catch (Exception e) 
			{
				e.printStackTrace();
			}
		  return data;
	  }
	  
	  
	  public static int RowCountInExcel(String sheetName) throws EncryptedDocumentException, InvalidFormatException, IOException
	  {
	  	int RowCount = 0;
	  	FileInputStream file = new FileInputStream("testdata\\testdata.xls");
	    	Workbook workbook = WorkbookFactory.create(file);
	    	Sheet sheet = workbook.getSheet(sheetName);
	      	RowCount = sheet.getLastRowNum();
	  	return RowCount;
	  }

}
