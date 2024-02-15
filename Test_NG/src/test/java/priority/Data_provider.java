package priority;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {
	@DataProvider(name ="fb")
	String[][] fb()
	{
		String[][] s=new String[10][4];
		s[0][0]="Sunmathi"; s[0][1]="Dhanu";s[0][2]="8111014077"; s[0][3]="sam@26";
		s[1][0]="Sunmathi"; s[1][1]="dh";   s[1][2]="8111014077"; s[1][3]="sam";
		s[2][0]="sun";      s[2][1]="Dhanu";s[2][2]="8110140";    s[2][3]="sam@26";
		s[3][0]="sun";      s[3][1]="dhan"; s[3][2]="8110140";    s[3][3]="sam";
		s[4][0]="Sunmathi"; s[4][1]="dhan"; s[4][2]="8110140";    s[4][3]="sam@26";
		s[5][0]="sunm";     s[5][1]="Dhanu";s[5][2]="8111014077"; s[5][3]="sam";
		s[6][0]="Sunmathi"; s[6][1]="dhan"; s[6][2]="8110140";    s[6][3]="sam";
		s[7][0]="sunm";     s[7][1]="Dhanu";s[7][2]= "8111014077";s[7][3]="sam@26";
		s[8][0]="Sunmathi"; s[8][1]="Dhanu";s[8][2]="8110140";    s[8][3]="sam";
		s[9][0]="sunmat" ;   s[9][1]="dhan"; s[9][2]="8111014077";  s[9][3]="sam@26";
		
		return s;
	}
	
	@Test(dataProvider ="fb")
	void Sign_up(String fname,String sname,String pnum,String pass)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(sname);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(pnum);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(pass);
	}
	

}
