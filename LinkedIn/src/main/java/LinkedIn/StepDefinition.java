package LinkedIn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.mysql.cj.result.Row;

import bean.ExcelRow;
import io.appium.java_client.MobileElement;

public class StepDefinition 
{
	XSSFRow row = null ;
	XSSFCell cell = null;
	XSSFSheet sheet = null ;
	XSSFWorkbook workbook ;
	File src;
	FileOutputStream f ;
	protected static WebDriver driver ;
	static String getotp ;
	
	protected WebDriver getDriver()
	{
		if (driver== null)
		{
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver ();
		}
		return driver ;
	}
	
	public void highlight (WebElement element)
	{
	
		JavascriptExecutor js = (JavascriptExecutor)driver;   
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", element);
	}
	
	public  String  read_data (String sheet_name,int i , int j) throws Exception
	{
		
		File src = new File("C:\\Users\\user\\eclipse-workspace\\LinkedIn\\LinkedIn Profiles.xlsx");
		FileInputStream f = new FileInputStream(src);
		XSSFWorkbook workbook = new XSSFWorkbook (f);
		XSSFSheet sheet = workbook.getSheet(sheet_name);
		XSSFCell cell = sheet.getRow(i).getCell(j);
		cell.setCellType(CellType.STRING);
		return cell.getStringCellValue();
		
	}


// public void  write () throws Exception
// {
//		XSSFWorkbook workbook ;
//	 	XSSFSheet sheet;
//	 	XSSFRow row ;
//	 	int j = 0;
//	 	XSSFWorkbook w1 = new XSSFWorkbook ();
//	 	File src = new File("C:\\Users\\user\\eclipse-workspace\\LinkedIn\\LinkedIn Data.xlsx");
//	 	FileOutputStream outputStream = new FileOutputStream(src);
//	 	String sheetName = "User Data";
//	 	sheet =(XSSFSheet)w1.createSheet(sheetName);
//	 	row = sheet.createRow(1);
//	 	w1.write(outputStream);
//	 	
// 	  	WebElement click_connection = driver.findElement(By.xpath("//*[@class='app-aware-link']"));
//		highlight (click_connection);
//		click_connection.click();
//		String read_url = driver.getCurrentUrl();
//		System.out.println(read_url);
//		Thread.sleep(3000);
//		String read_name = driver.findElement(By.xpath("//*[@class='text-heading-xlarge inline t-24 v-align-middle break-words']")).getText();
//		System.out.println(read_name);
//		
//		String read_designation = driver.findElement(By.xpath("//*[@class='text-body-medium break-words']")).getText();
//		System.out.println(read_designation);
//
//		Thread.sleep(2000);
//		System.out.println(read_designation);
//		String read_company = driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/main[1]/div[1]/section[1]/div[2]/div[2]/ul[1]/li[1]/a[1]/h2[1]/div[1]")).getText();
//
// 	   
// 	    File src5 = new File("C:\\Users\\user\\eclipse-workspace\\LinkedIn\\LinkedIn Data.xlsx");
// 	    FileOutputStream outputStream5 = new FileOutputStream(src);
// 	    row.createCell(j).setCellValue(read_url);
// 	    j++;
// 	    row.createCell(j).setCellValue(read_name);
// 	    j++;
// 	    row.createCell(j).setCellValue(read_designation);
// 	    j++;
// 	    row.createCell(j).setCellValue(read_company);
// 	    w1.write(outputStream5);
// 	    System.out.println(read_company);
//	 
// }
	
//	public void writeExcel( String value,int i, int j) 
//	{
//		
//		File src = new File("C:\\Users\\user\\eclipse-workspace\\LinkedIn\\LinkedIn Data.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook ();
//        FileInputStream excelFile;
//                try {
//            excelFile = new FileInputStream(src);
//            workbook = new XSSFWorkbook(excelFile);
//
//            XSSFSheet sheet = workbook.getSheetAt(0);
//            Cell cell = sheet.getRow(i).getCell(j);
//            cell.setCellValue(value);
//            excelFile.close();
//
//            FileOutputStream outputStream = new FileOutputStream(src);
//            workbook.write(outputStream);
//            workbook.close();
//            outputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//	}
    public void write_excell () throws IOException, Exception
    {
    	XSSFWorkbook workbook ;
    	XSSFSheet sheet;
    	XSSFRow row ;
    	int j = 0;
    	XSSFWorkbook w1 = new XSSFWorkbook ();
    	File src = new File("C:\\Users\\user\\eclipse-workspace\\LinkedIn\\LinkedIn Data.xlsx");
    	FileOutputStream outputStream = new FileOutputStream(src);
    	String sheetName = "User Data";
    	sheet =(XSSFSheet)w1.createSheet(sheetName);
    	w1.write(outputStream);
    	
    	WebElement click_connection = driver.findElement(By.xpath("//*[@class='app-aware-link']"));
		highlight (click_connection);
		click_connection.click();
		String read_url = driver.getCurrentUrl();
		row = sheet.createRow(1);
    	row.createCell(j).setCellValue(read_url);
    	File src2 = new File("C:\\Users\\user\\eclipse-workspace\\LinkedIn\\LinkedIn Data.xlsx");
    	FileOutputStream outputStream2 = new FileOutputStream(src);
    	w1.write(outputStream2);
    	System.out.println(read_url);
    	j++;
    	System.out.println(j);
    	Thread.sleep(3000);
		String read_name = driver.findElement(By.xpath("//*[@class='text-heading-xlarge inline t-24 v-align-middle break-words']")).getText();
//		row = sheet.createRow(1);
    	row.createCell(j).setCellValue(read_name);
    	File src3 = new File("C:\\Users\\user\\eclipse-workspace\\LinkedIn\\LinkedIn Data.xlsx");
    	FileOutputStream outputStream3 = new FileOutputStream(src);
    	w1.write(outputStream3);
    	System.out.println(read_name);
    	Thread.sleep(3000);
		j++;
		System.out.println(j);
		Thread.sleep(2000);
		
		String read_designation = driver.findElement(By.xpath("//*[@class='text-body-medium break-words']")).getText();
		System.out.println(read_designation);
//		row = sheet.createRow(1);
    	row.createCell(j).setCellValue(read_designation);
    	File src4 = new File("C:\\Users\\user\\eclipse-workspace\\LinkedIn\\LinkedIn Data.xlsx");
    	FileOutputStream outputStream4 = new FileOutputStream(src);
    	w1.write(outputStream4);
    	System.out.println(read_designation);
		j++;
		System.out.println(j);
		Thread.sleep(2000);
		System.out.println(read_designation);
		String read_company = driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/main[1]/div[1]/section[1]/div[2]/div[2]/ul[1]/li[1]/a[1]/h2[1]/div[1]")).getText();
//		row = sheet.createRow(1);
    	row.createCell(j).setCellValue(read_designation);
    	File src5 = new File("C:\\Users\\user\\eclipse-workspace\\LinkedIn\\LinkedIn Data.xlsx");
    	FileOutputStream outputStream5 = new FileOutputStream(src);
    	w1.write(outputStream5);
    	System.out.println(read_company);
    	
    	
    }
    public void write (String value ,int i, int j) throws Exception
    {
    	
   		XSSFWorkbook workbook ;
   	 	XSSFSheet sheet;
   	 	XSSFRow row ;
//   	 	int j = 0;
   	 	XSSFWorkbook w1 = new XSSFWorkbook ();
   	 	File src = new File("C:\\Users\\user\\eclipse-workspace\\LinkedIn\\LinkedIn Data.xlsx");
   	 	FileOutputStream outputStream = new FileOutputStream(src);
        
   	 	if(w1.getNumberOfSheets()==0)
   	 	{
   	   	 	String sheetName = "User Data";
   	   	    sheet =(XSSFSheet)w1.createSheet(sheetName);
   		 	row = sheet.createRow(i);
   		 	w1.write(outputStream);
   	 		System.out.println("start");
   	 	File src5 = new File("C:\\Users\\user\\eclipse-workspace\\LinkedIn\\LinkedIn Data.xlsx");
    	FileOutputStream outputStream5 = new FileOutputStream(src);
    	row.createCell(j).setCellValue(value);
    	
    	row.createCell(j).setCellValue(value);
    	
    	row.createCell(j).setCellValue(value);
    	
    	row.createCell(j).setCellValue(value);
    	w1.write(outputStream5);
    	w1.close();
    	System.out.println("close");
   	 	}
   	 	else 
   	 	{
   	 	System.out.println("start2");
   	    System.out.println(i);
   	 	File src5 = new File("C:\\Users\\user\\eclipse-workspace\\LinkedIn\\LinkedIn Data.xlsx");
    	FileOutputStream outputStream5 = new FileOutputStream(src);
    	sheet = w1.getSheet("User Data");
    	row = sheet.createRow(i);
    	
    	row.createCell(j).setCellValue(value);
    	
    	row.createCell(j).setCellValue(value);
    	
    	row.createCell(j).setCellValue(value);
    	
    	row.createCell(j).setCellValue(value);
    	w1.write(outputStream5);
    	w1.close();
    	System.out.println("close2");
   	 	}
    	
 //   	return(value);
//   	 	return new ExcelRow (value, i, j) ;
    
    	
   	 
    }
    
    public void write (ArrayList <ExcelRow> data) throws Exception
    {
    	XSSFWorkbook workbook ;
   	 	XSSFSheet sheet;
   	 	XSSFRow row1 ;
//   	 	int j = 0;
   	 	XSSFWorkbook w1 = new XSSFWorkbook ();
   	 	File src = new File("C:\\Users\\user\\eclipse-workspace\\LinkedIn\\LinkedIn Data.xlsx");
   	 	FileOutputStream outputStream = new FileOutputStream(src);
        
   	 	if(w1.getNumberOfSheets()==0)
   	 	{
   	   	 	String sheetName = "User Data";
   	   	    sheet =(XSSFSheet)w1.createSheet(sheetName);
   	 	}
   	 	else 
   	 	{
   	 		sheet = w1.getSheet("User Data");
   	 	}
   	 	
    	for (ExcelRow row : data)
    	{
   		 	row1 = sheet.createRow(row.getRow());
//   		    row1.createCell(row.getCol()).setCellValue(row.getData());
   		 	
    		System.out.println(row.toString());
	
    	}
    	w1.write(outputStream);
    	w1.close();
    	
    }
}

