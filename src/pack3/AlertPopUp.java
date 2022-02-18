package pack3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		System.out.println("Browser opened successfully");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Window Maximized successfully");
		driver.get("https://demoqa.com/alerts");
		
//		driver.findElement(By.id("alertButton")).click();
//		 Thread.sleep(3000);
//		 driver.switchTo().alert().accept();
//		
//        driver.findElement(By.id("timerAlertButton")).click();
//        Thread.sleep(7000);
//        driver.switchTo().alert().accept();
//        Thread.sleep(3000);
//        driver.findElement(By.id("confirmButton")).click();
//        Thread.sleep(3000);
//        driver.switchTo().alert().dismiss();
//        Thread.sleep(3000);
//        driver.findElement(By.id("promtButton")).click();
//        Thread.sleep(3000);
//        driver.switchTo().alert().sendKeys("Pavan");
//        Thread.sleep(3000);
//        driver.switchTo().alert().accept();
//		System.out.println(driver.getWindowHandle());
		
        driver.findElement(By.xpath("//span[text()='Browser Windows']")).click();
        driver.findElement(By.id("tabButton")).click();
        driver.findElement(By.id("windowButton")).click();
        driver.findElement(By.id("messageWindowButton")).click();
        
        List<String> alladdresses= new ArrayList<String>(driver.getWindowHandles());
         
        System.out.println(alladdresses);
        
        driver.switchTo().window(alladdresses.get(1)); //
      
        
	}

}
