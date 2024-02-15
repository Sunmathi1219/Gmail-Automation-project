package priority;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider_1 extends Base_Dataprovider{
	@DataProvider(name = "log")
	String[][] login()
	{
		String[][] s=new String[4][2];
		s[0][1]=get_data(0,0,0);  s[0][1]=get_data(0,0,1);
		s[1][1]=get_data(0,1,0);  s[1][1]=get_data(0,1,1);
		s[2][1]=get_data(0,2,0);  s[2][1]=get_data(0,2,1);
		s[3][1]=get_data(0,3,0);  s[3][1]=get_data(0,3,1);
     return s;
		
	}
	@Test(dataProvider ="log" )
	void facebook(String mailid,String password)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(mailid);
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	

}
