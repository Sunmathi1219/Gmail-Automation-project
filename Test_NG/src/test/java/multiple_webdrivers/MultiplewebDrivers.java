package multiple_webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiplewebDrivers {

	
	WebDriver driver;
	@Parameters({"web"})
	@Test(priority = 0)
	void insta(String browser) throws InterruptedException  

	{
		if(browser.equals("edge"))
		{
		driver=new EdgeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(3000);
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get("https://www.instagram.com/accounts/login/?hl=en");
			Thread.sleep(3000);
		}
		else
		{
			driver=new ChromeDriver();
			driver.get("https://www.instagram.com/accounts/login/?hl=en");
			Thread.sleep(3000);
		}
			
	}
	@Parameters({"//input[@aria-label='Phone number, username, or email']","//input[@aria-label='Password']"})
	@Test(priority = 1)
	void Login(String username,String pass)
	{
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(pass);
	}
}
