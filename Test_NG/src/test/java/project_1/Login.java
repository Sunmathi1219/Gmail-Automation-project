package project_1;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Login {
	WebDriver driver;
	
	@BeforeSuite
	public void get()
	{
	  driver=new ChromeDriver();
		
	}
	@Test(priority = 0)
	public void email_login() throws InterruptedException
	{
		
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=ASKXGp11h97LC1aGgQt1IWh5J7X5nzkG2pPmZ0srLpx-9mfg74Cgf1qDyFfG_xNb2zP2FD0zYSfDWQ&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		//task1-login
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("barviraj2002@gmail.com");
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Barvin@123");
        driver.findElement(By.id("passwordNext")).click(); 
        
        //task2-compose
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//div[@jslog='20510; u014N:cOuCgd,Kr2w4b']")).click();
        
        //task3-To
        
        
        Thread.sleep(3000);
      WebElement element = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
      element = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
      element.sendKeys("abscdfv@gmail.com" +Keys.ENTER);
      
      //task6-mouse hover
      Thread.sleep(5000);
    
      Actions a=new Actions(driver);
      a.moveToElement(element).perform();
      
      element = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
      element.sendKeys("sunmathiuthra26@gmail.com" +Keys.ENTER);

      
      /* cc
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      element = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
      element.sendKeys("abs123@gmail.com" +Keys.ENTER);
      
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      element = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
      element.sendKeys("abcd123@gmail.com" +Keys.ENTER);
      
     
      
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.findElement(By.xpath("(//span[text()='Cc'])[1]")).click();
       
       WebElement element2 = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
       element2.sendKeys("abs123@gmail.com");
       */
       
       /*driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
       element2=driver.findElement(By.xpath("(//input[@type='text'])[5]"));
       element2.sendKeys("abcd123@gmail.com"+Keys.ENTER);
      
       driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
       element2 = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
       element2.sendKeys("abs123@gmail.com" +Keys.ENTER);
       
       driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
       element2 = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
       element2.sendKeys("abcd123@gmail.com" +Keys.ENTER);
       
       element2 = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
       element.sendKeys("sunmathiuthra26@gmail.com" +Keys.ENTER);
          */
       
       //task 4-subject
      Thread.sleep(3000);
       WebElement element3 = driver.findElement(By.cssSelector(".aoD.az6 input"));
       element3.sendKeys("AutomationTasks");
       
       //task 5-upload file
       
       //driver.findElement(By.xpath("(//div[@jslog='56742; u014N:xr6bB,cOuCgd,Kr2w4b'])[2]")).click(); 
       
       //task7-send
       Thread.sleep(3000);
       
       driver.findElement(By.xpath("//div[@aria-label='Send ‪(Ctrl-Enter)‬']")).click();
       
       // task8
       Thread.sleep(3000);
       
       driver.findElement(By.linkText("Inbox")).click();
       
       //task9
       Thread.sleep(3000);
       
       driver.findElement(By.linkText("Sent")).click();
	
	  //task10
       
       Thread.sleep(3000);
       driver.findElement(By.linkText("Drafts")).click();
	}
    @AfterSuite
    public void quite() throws InterruptedException
    {
    	Thread.sleep(4000);
    	driver.quit();
    }
}
