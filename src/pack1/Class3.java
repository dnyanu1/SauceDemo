package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Class3 {

	public static void main(String[] args) 
	{
	WebDriver driver;
	String browser="Chrome";
	if(browser=="Chrome")
	{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");	
	 driver= new ChromeDriver();
	}
	else
	{
		System.setProperty("webdriver.edge.driver", "C:\\MIcrosoft edge\\msedgedriver.exe");
		driver= new EdgeDriver();
	}
	driver.get("https://www.facebook.com");
	
	String Expectedurl="https://www.facebook.com/";
	String Actualurl=driver.getCurrentUrl();
	System.out.println( Actualurl);
   System.out.println(driver.getTitle());
   
	if(Actualurl.contentEquals(Expectedurl))
	{
	 System.out.println("passed");
	}
		
	else
	{
	  System.out.println("failed");	
	}
	
	driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("yashunhale");
	
   	driver.findElement(By.xpath("//button[@value='1']")).click();
	}

}
