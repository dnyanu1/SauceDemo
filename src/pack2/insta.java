package pack2;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class insta {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		
		Date d = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYYY_HHmmss");
	   String timestamp = sdf.format(d);
	   
	   
		System.out.println("Browser opened");
		driver.manage().window().maximize();//chaining method
		System.out.println("Window Maximized");
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);
		System.out.println("Instagram Log in Page Opened");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("dny8");
		Thread.sleep(2000);
		System.out.println("Username Entered");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("908");
		Thread.sleep(3000);
		System.out.println("Password Entered");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Logged in successfully");
		Thread.sleep(3000);
		boolean Textbox= driver.findElement(By.xpath("//div[@class='eyXLr']")).isEnabled();
		if (Textbox == true)
		{
			driver.findElement(By.xpath("//div[@class='eyXLr']")).click();	
			System.out.println("Textbox is enabled");
		}
		else
		{
			System.out.println("Textbox is not enabled");	
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("dnya88");
		Thread.sleep(3000);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='dnyanu4988']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='XrOey']//a)[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Send Message']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys("dnyanu4988");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='dnyanu4988'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@placeholder='Message...']")).sendKeys("Its been a long time");
		Thread.sleep(3000);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Send']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class='wpO6b  '])[4]")).click();
		Thread.sleep(3000);
   WebElement Option=driver.findElement(By.xpath("(//button[@class='wpO6b  '] )[2]"));
        boolean R=Option.isDisplayed();
        if(R==true)
        {
        	System.out.println("option is visible");
        	Option.click();
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='Ysd_U'])[3]")).click();
        Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='wgVJm']")).click();
		 Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='Send']")).click();
		
      //  (//div[@class='Ysd_U'])[3]
      //button[text()='Like']
        // (//button[@class='wpO6b  '] )[2]
		//  (//button[@class='wpO6b  '] )[2]
		//textarea[@placeholder='Message...']
		//div[text()='Next']
		//div[text()='dnyanu4988']
		//search //input[@placeholder='Search...']
		// Send Message
		// mesg //a[contains(@aria-label,'messaging')]
//		driver.findElement(By.xpath("(//button[text()='Follow'])[1]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//img[contains(@alt,'dnyanu7428')])")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//div[text()='Log Out']")).click();
	}

}
