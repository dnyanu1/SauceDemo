package pack5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class CombineKeys {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
	WebDriver driver= new EdgeDriver();
		driver.get("https://text-compare.com");
	WebElement box1=driver.findElement(By.xpath("//textarea[@name='text1']"));
	WebElement box2=driver.findElement(By.xpath("//textarea[@name='text2']"));
		
	Actions act= new Actions(driver);
	
	act.click(box1).sendKeys("Selenium webdriver").perform();
	
    act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

    act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

    box2.click();
    act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
     Thread.sleep(2000);
   driver.findElement(By.xpath("//button[contains(text(),'Edit texts')]")).click();	
   driver.findElement(By.xpath("//button[contains(text(),'Edit texts')]")).getText();
   
	}

}
