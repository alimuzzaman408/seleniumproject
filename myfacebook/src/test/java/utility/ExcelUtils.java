package utility;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static FileInputStream ExcelFile;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFSheet ExcelWSheet;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	private static FileOutputStream Fileout;

	public static String GetCellData(File path,String SheetName,int rowNum,int colNum) throws Exception{
		ExcelFile=new FileInputStream(path);
		ExcelWBook=new XSSFWorkbook(ExcelFile);
		ExcelWSheet=ExcelWBook.getSheet(SheetName);
		Cell=ExcelWSheet.getRow(rowNum).getCell(colNum);
		String CellData=Cell.getStringCellValue();

		ExcelWBook.close();
		ExcelFile.close();
		return CellData;

	}
public static void SetCellData(File path,String SheetName,int rowNum,int colNum, String Result) throws Exception{
	ExcelFile=new FileInputStream(path);
	ExcelWBook=new XSSFWorkbook(ExcelFile);
	ExcelWSheet=ExcelWBook.getSheet(SheetName);
	//Retrieve the row and check for Null
	
	Row=ExcelWSheet.getRow(rowNum);
	if(Row==null){
		Row=ExcelWSheet.createRow(rowNum);
		
		
	}
	//update the value of the cell
Cell=Row.createCell(colNum);
if(Cell==null){
	Cell=Row.createCell(colNum);
}

Cell.setCellValue(Result);
Fileout=new FileOutputStream(path);
ExcelWBook.write(Fileout);
Fileout.flush();
Fileout.close();
}




}
