package priority;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Fb_signin {
	@Parameters({"//input[@name='firstname']","//input[@name='lastname']","//input[@name='reg_email__']","//input[@name='reg_passwd__']"})
	@Test
	void datas(String fname,String sname,String pnum,String pass)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(sname);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(pnum);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(pass);
		driver.quit();
	}

}
