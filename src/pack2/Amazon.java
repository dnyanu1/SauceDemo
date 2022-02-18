package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon
{
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
	WebDriver driver =new EdgeDriver();
	
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.id("nav-search-bar-form")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("the alchemist");
	Thread.sleep(2000);
	driver.findElement(By.id("nav-search-submit-button")).sendKeys("the alchemist");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[contains(text(),'Paperback')][1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value='Delete']")).click();
//	Thread.sleep(4000);
//	driver.findElement(By.id("nav-hamburger-menu")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//div[text()='Amazon Prime Video']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//a[text()='Movies']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//span[text()='Start your 30-day free trial']")).click();	
 }
}
