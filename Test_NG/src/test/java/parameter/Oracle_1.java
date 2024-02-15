package parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Oracle_1 {
	@Parameters({"sView1:r1:0:email::content","sView1:r1:0:password::content","sView1:r1:0:retypePassword::content","sView1:r1:0:firstName::content","sView1:r1:0:lastName::content",
		"sView1:r1:0:jobTitle::content","sView1:r1:0:workPhone::content","sView1:r1:0:companyName::content","sView1:r1:0:address1::content","sView1:r1:0:city::content","sView1:r1:0:postalCode::content"})
	
	@Test
	void data(String email,String password,String repass,String fname,String lname,String job,String wphone,String cname,String addr,String city,String zip)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		driver.findElement(By.id("sView1:r1:0:email::content")).sendKeys(email);
		driver.findElement(By.id("sView1:r1:0:password::content")).sendKeys(password);
		driver.findElement(By.id("sView1:r1:0:retypePassword::content")).sendKeys(repass);
		driver.findElement(By.id("sView1:r1:0:firstName::content")).sendKeys(fname);
		driver.findElement(By.id("sView1:r1:0:lastName::content")).sendKeys(lname);
		driver.findElement(By.id("sView1:r1:0:jobTitle::content")).sendKeys(job);
		driver.findElement(By.id("sView1:r1:0:workPhone::content")).sendKeys(wphone);
		driver.findElement(By.id("sView1:r1:0:companyName::content")).sendKeys(cname);
		driver.findElement(By.id("sView1:r1:0:address1::content")).sendKeys(addr);
		driver.findElement(By.id("sView1:r1:0:city::content")).sendKeys(city);
		driver.findElement(By.id("sView1:r1:0:postalCode::content")).sendKeys(zip);
		driver.quit();
	}
}
