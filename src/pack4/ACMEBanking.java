package pack4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ACMEBanking {

	public static void main(String[] args) throws InterruptedException 
	{
  
   System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
   WebDriver driver= new EdgeDriver();
   System.out.println("Browser opened successfully");
   
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
   driver.get("https://demo.applitools.com");
   System.out.println("got to the website");
   
   driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dnyanu7428");
   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("dnyanu7428");
   WebElement LogIn= driver.findElement(By.xpath("//a[@id='log-in']"));
   
        Actions act= new Actions(driver); //Actions Class of Selenium, 
   
//		act.click(LogIn).perform();       // method to create action
//		act.contextClick().perform();      // method to create action
//      act.moveToElement(LogIn).click().perform(); // method to create action
        act.doubleClick(LogIn).perform();  // perform() will execute the action
        
       driver.findElement(By.xpath("//span[text()='View Statement']")).click();
       
      JavascriptExecutor scrolling=(JavascriptExecutor)driver;
      scrolling.executeScript("window.scrollBy(15,1000)");
      System.out.println("Scrolled down");
      Thread.sleep(3000);
   
      scrolling.executeScript("window.scrollBy(0,-1000)");
      System.out.println("Scrolled up");
     
	}
}
