package Febbletest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * It is a generic library Class
 * @author Saranjit
 *
 */

public class FileLib {
	/**
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public String getPropertyValue(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
	String value = p.getProperty(key);
	return value;
			
	}
	
	/**
	 * 
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws Exception 
	 */
	
	public String getExcelValue(String sheetname,int rownum,int cellnum) throws Exception{
		 FileInputStream fis=new FileInputStream("./data/TestData.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 String value = wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).toString();
		 return value;
		 }
		



}
