package Com.Actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This class is a generic class which is having non static methods to perform data driven testing
 * @author Pooja 
 *
 */
public class FileLibrary {
	/**
	 * 
	 * This method is anon static method which is used to read the data from property file
	 * @param key 
	 * @param key
	 * @param returnvalue1 
	 * @return
	 * @throws IOException
	 */
   public String readDataFromProperty(String key) throws IOException {
	   //for read the property file we use file input stream
	   FileInputStream fis=new FileInputStream("./Testdata/commondata.property");
	   //call the non static method inside the property file
	   Properties p=new Properties();
	   //property files inside non static method  load
	   p.load(fis);
	   //to  get non static method inside property file
	     String value = p.getProperty(key);
	     //return the value
	     return value;
	    
	  
	     
	   
	   
   }
   /**
    * This method is non static method which is used to read the data from excel sheet
    * @param Sheetname
    * @param row
    * @param cell
    * @return
    * @throws EncryptedDocumentException
    * @throws IOException
    */

	public String readDataFromExcelFile(String Sheetname, int row, int cell) throws EncryptedDocumentException, IOException {
	
		FileInputStream fis1=new FileInputStream("./Testdata/Testdata.xlsx");
	    Workbook wb = WorkbookFactory.create(fis1);
	    String value1 = wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	   return value1;
	}
}
