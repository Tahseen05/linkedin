package LinkedIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import LinkedIn.StepDefinition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login extends StepDefinition
{
	WebDriver driver = getDriver ();
	
	@Given("^: open url$")
	public void open_url() throws Exception
	{
		driver.get("https://www.linkedin.com/home");
		System.out.println("one");
		Thread.sleep(4000);
		driver.getWindowHandle();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement signin = driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/a[2]"));
		highlight (signin);
		signin.click();
		Thread.sleep(3000);
	}
	
	@Then("^: enter username$")
	public void enter_username() throws Exception
	{
		
		
		String username = read_data ("Login details",1,0);
		WebElement un = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/div[1]/form[1]/div[1]/input[1]"));
		highlight (un);
		un.sendKeys(username);
		Thread.sleep(3000);
	
	}
	
	@Then("^: enter password$")
	public void enter_password() throws Exception
	{
		String password = read_data ("Login details",1 ,1);
		WebElement pw = driver.findElement(By.xpath("//input[@id='password']"));
		highlight (pw);
		pw.sendKeys(password);
		Thread.sleep(3000);
	}
	
	@And("^: sign in$")
	public void sign_in() throws Exception
	{
		WebElement signin = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/div[1]/form[1]/div[3]/button[1]"));
		highlight (signin);
		signin.click();
		Thread.sleep(3000);
	}
	
}
