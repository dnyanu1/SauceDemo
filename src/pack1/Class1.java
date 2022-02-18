package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class1 
   {
   public static void main(String[] args) 
	{                                    // select +shift+right click to copy path
 System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver2 =  new ChromeDriver(); // ctrl+shift+o for import
// driver.get("https://www.facebook.com");
// System.out.println(driver.getTitle());
// System.out.println(driver.getCurrentUrl());

// driver.close();
// driver.quit();
 
// System.setProperty("webdriver.edge.driver","C:\\MIcrosoft edge\\msedgedriver.exe");
// WebDriver driver2 = new EdgeDriver(); //upcasting 
 driver2.get("https://www.google.com");
// System.out.println(driver2.getTitle());
// System.out.println(driver2.getCurrentUrl());
 WebElement element=  driver2.findElement(By.xpath("//a[text()='Sign in']"));
// driver2.close();
// driver2.quit();
 System.out.println(element.getLocation().getX());
 System.out.println(element.getLocation().getY());
 System.out.println(element.getSize());
// System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver.exe");
// WebDriver driver3 = new FirefoxDriver();
// driver3.get("https://www.google.com");
	}
  }
