package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Class5 {

	public static void main(String[] args) throws InterruptedException 
	{
   System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
//	System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
//	WebDriver driver= new EdgeDriver();
	driver.manage().window().maximize();//chaining method
	driver.get("https://www.instagram.com");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("amrishpuri");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("8149ggjdghq");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	WebElement LoginwithFacebook=driver.findElement(By.xpath("//span[@class='KPnG0']"));
	LoginwithFacebook.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Amrishpuri@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Password");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@name='reset_action']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("8149991683");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='/login.php']")).click();
	
//tagname[@attribute='value']  by attribute
//tagname[text()='htmltext']  by text(need complete text)
//tagname[contains(@attribute,'value')] by contains 
//tagname[contains(text(),'htmltext')] by contains(partial text)
	
	//input[@id='email']
	//input[@name='pass']
	//button[@id='loginbutton']
	//a[text()='Forgotten password?']
	//a[@name='reset_action']
	//input[@id='identify_email']
	//button[@type='submit']
	//a[@href='/login.php']
	
	}

}
