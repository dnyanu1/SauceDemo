package pack4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Zoom {

	public static void main(String[] args) throws InterruptedException 
	{
    System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
	WebDriver driver= new EdgeDriver();
	System.out.println("Browser opened successfully");
				   
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.get("https://zoom.us/signup");
    driver.findElement(By.xpath("(//div[@class='zm-select-input'])[2]")).click();
    driver.findElement(By.xpath("//dd[@id='select-item-select-1-30']")).click();
    
    driver.findElement(By.xpath("//div[@id='dropdown-hostmeeting']")).click();
    Thread.sleep(2000);
//    
////    driver.findElement(By.xpath("(//div[@id='dropdown-hostmeeting']//li)[3]")).click();
////    System.out.println("clicked");
//   
    List<WebElement> list = driver.findElements(By.xpath("//div[@id='dropdown-hostmeeting']//li"));
    for(int i=0; i<list.size(); i++)
    {
    	 if(list.get(i).getText().contains("Screen Share Only")) {
             
    		 list.get(i).click();
             break;
    	 }
//    	System.out.println(list.get(i).getText());
    }
//    
//     Actions act= new Actions(driver);
//     act.moveToElement(driver.findElement(By.id("btnResouces"))).perform();
//     System.out.println("Resources");
//     Thread.sleep(1000);
//   List<WebElement> list1=driver.findElements(By.xpath("//ul[@id='resourcesDropdown']//li[@role='none']")); 
////     
//   list1.get(6).getText();
//   System.out.println(list1.get(6).getText());
//     
////   list1.get(6).click();
//   
//   
//   JavascriptExecutor scroll= (JavascriptExecutor)driver;
//   scroll.executeScript("window.scrollBy(0,800)");
//     
//     WebElement languages=driver.findElement(By.xpath("//div[contains(@class,'dropdown-language')]"));
//     act.click(languages).perform();
//     
//     List<WebElement> list2= driver.findElements(By.xpath("//div[contains(@class,'dropdown-language')]//li"));
//     for(WebElement lang : list2)
//     {
//    	 System.out.println(lang.getText());
//     }
    
  
	}
}
