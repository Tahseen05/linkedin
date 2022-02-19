package LinkedIn;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import bean.ExcelRow;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.remote.NewAppiumSessionPayload;

public class Connections  extends StepDefinition
{
	ArrayList excell_row_data = new ArrayList<ExcelRow>() ;
//	XSSFSheet sheet = null ;
	XSSFRow row = null ;
	XSSFCell cell = null;
//	XSSFWorkbook workbook ;
	File src = new File("C:\\Users\\user\\eclipse-workspace\\LinkedIn\\LinkedIn Data.xlsx");
	
	XSSFWorkbook workbook = new XSSFWorkbook ();
    XSSFSheet sheet = workbook.createSheet("User data");
	private ExcelRow user_row; 
	@Given("^: open new tab$")
	public void open_new_tab () throws Exception
	{

		ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
		Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_T);
       
		Thread.sleep(3000);
	}
	
	@Then("^: open connection url$")
	public void open_connection_url () throws Exception
	{
		ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(w.get(1));
		String connection_url = read_data ("Login details",1,2);
		driver.get(connection_url);
		Thread.sleep(4000);
		
	}
	
	@Then("^: click on connections$")
	public void click_on_connections() throws Exception
	{
		WebElement click_connections = driver.findElement(By.xpath("//*[@class='link-without-visited-state']"));
		highlight (click_connections);
		click_connections.click();
		Thread.sleep(5000);
//		Actions click_connections = new Actions (driver);
//		WebElement click_connections_path = driver.findElement(By.xpath("//body/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/main[1]/div[1]/section[1]/div[2]/ul[1]/li[1]/a[1]/span[1]"));
//		org.openqa.selenium.interactions.Action mouseOverconnections = click_connections.moveToElement(click_connections_path).build();
//		click_connections.moveToElement(click_connections_path).click().perform();
//		Thread.sleep(3000);
//		write_excell ();
//		write();
	}
	
	@Given("^: get connections url$")
	public void get_connections_url () throws Exception
	{
		WebElement click_connection = driver.findElement(By.xpath("//*[@class='app-aware-link']"));
		highlight (click_connection);
		click_connection.click();
		Thread.sleep(3000);
//		Actions click_connections = new Actions (driver);
//		WebElement click_connections_path = driver.findElement(By.xpath("//*[@class='app-aware-link']"));
//		org.openqa.selenium.interactions.Action mouseOverconnections = click_connections.moveToElement(click_connections_path).build();
//		click_connections.moveToElement(click_connections_path).click().perform();
//		Thread.sleep(3000);
		String read_url = driver.getCurrentUrl();
//		create_file();
//		System.out.println(read_url);
//		 write(read_name ,1,1);
//		excell_row_data.add(new ExcelRow(read_url, 1, 0));
		user_row = new ExcelRow ();
	
		user_row.setCell(cell);
		Thread.sleep(3000);
//		write ();
		
	}
		@Then("^: read name$")
	public void read_name() throws Exception
	{
		String read_name = driver.findElement(By.xpath("//*[@class='text-heading-xlarge inline t-24 v-align-middle break-words']")).getText();
//		System.out.println(read_name);
//	highlight (read_name);
//	    write(read_name ,1,1);
	    excell_row_data.add(new ExcelRow(read_name, 1, 1));
	}
	
	@Then("^: read designation$")
	public void read_designation() throws Exception
	{
		String read_designation = driver.findElement(By.xpath("//*[@class='text-body-medium break-words']")).getText();
//		System.out.println(read_designation);
//		highlight (read_name);
//		write(read_designation ,1,1);
		excell_row_data.add(new ExcelRow(read_designation, 1, 2));
		
	}
	
	@Then("^: read company$")
	public void read_company() throws Exception
	{
		String read_company = driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/main[1]/div[1]/section[1]/div[2]/div[2]/ul[1]/li[1]/a[1]/h2[1]/div[1]")).getText();
//		System.out.println(read_company);
////		highlight (read_name);
//		write(read_company ,1,3);
		excell_row_data.add(new ExcelRow(read_company, 1, 3));
		
	}
	
	@Then("^: write data$")
	public void write_data() throws Exception
	{
		write(excell_row_data);
	}
}
