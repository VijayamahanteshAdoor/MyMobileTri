package commonutility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelReadWrite extends DriverProvider {
	
	private static Workbook Wb ;
	private static FileInputStream fis;
	
	public static Workbook setExcel(String filePath,String fileName)
	{

		try {
				 File file =    new File(filePath+"\\"+fileName);
				  fis = new FileInputStream(file);
				 Wb = null;
				 //Wb= new XSSFWorkbook(fis);
				String fileExtensionName = fileName.substring(fileName.indexOf("."));
				 if(fileExtensionName.equals(".xlsx"))
				 {
					 Wb = new XSSFWorkbook(fis);
				 }
				 else if(fileExtensionName.equals(".xls"))
				 {
					 Wb = new HSSFWorkbook(fis);
				 }
				 
				  
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		return Wb;
	}
	
	public static String readExcel(String sheetName,int rowNum,int colNum)
	{
		String celltext=null;
		try {
		Sheet sheet = Wb.getSheet(sheetName);
		Row row=sheet.getRow(rowNum);
		Cell cell=row.getCell(colNum);
		
		if(cell==null)
			celltext="";
		else if (cell.getCellType()==cell.CELL_TYPE_STRING)
			celltext=cell.getStringCellValue();
		else if (cell.getCellType()==cell.CELL_TYPE_NUMERIC)
			celltext=String.valueOf((int)(cell.getNumericCellValue()));		
		fis.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//System.out.println(celltext);
		
		return celltext;
	}

	/*public static void main(String args[]){
		
		setExcel(Constants.PATH_TESTDATA, Constants.FILE_TESTDATA);
		String celldata = readExcel("data", 1, 0);
		System.out.println(celldata+"data printed");
	}
*/
}
