package pack4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
        {

	public static void main(String[] args) throws InterruptedException
	  {
		System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe"); 
		WebDriver driver= new EdgeDriver();
		System.out.println("Browser opened successfully");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		System.out.println("url opened successfully");
		
		WebElement capitals= driver.findElement(By.xpath("//div[@id='capitals']"));
		System.out.println("capitals");
		WebElement Italy= driver.findElement(By.xpath("//div[text()='Italy']"));
		System.out.println("Italy");
		WebElement Spain= driver.findElement(By.xpath("//div[text()='Spain']"));
		System.out.println("Spain");
		WebElement US= driver.findElement(By.xpath("//div[text()='United States']"));
		System.out.println("United States");
		WebElement Denmark= driver.findElement(By.xpath("//div[text()='Denmark']"));
		System.out.println("Denmark");
		WebElement Korea= driver.findElement(By.xpath("//div[text()='South Korea']"));
		System.out.println("South Korea");
		WebElement Norway= driver.findElement(By.xpath("//div[text()='Norway']"));
		System.out.println("Norway");
		WebElement Sweden= driver.findElement(By.xpath("//div[text()='Sweden']"));
		System.out.println("Sweden");
		
		
		
		WebElement Copenhagen=driver.findElement(By.xpath("(//div[text()='Copenhagen'])[2]"));
		System.out.println("Copenhagen");
		WebElement Washington=driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
		System.out.println("Washington");
		WebElement Oslo=driver.findElement(By.xpath("(//div[text()='Oslo'])[2]"));
		System.out.println("Oslo");
		WebElement Madrid=driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"));
		System.out.println("Madrid");
		WebElement Seoul=driver.findElement(By.xpath("(//div[text()='Seoul'])[2]"));
		System.out.println("Seoul");
		WebElement Rome=driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
		System.out.println("Rome");
		WebElement Stockholm=driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]"));
		System.out.println("Stockholm");
		
		Actions act= new Actions(driver);
		act.doubleClick(Rome).dragAndDrop(Rome, Italy).perform();
		act.doubleClick(Madrid).dragAndDrop(Madrid, Spain).perform();
		act.doubleClick(Oslo).dragAndDrop(Oslo, Norway).perform();
		act.doubleClick(Copenhagen).dragAndDrop(Copenhagen, Denmark).perform();
		act.doubleClick(Seoul).dragAndDrop(Seoul, Korea).perform();
		act.doubleClick(Washington).dragAndDrop(Washington, US).perform();
		act.doubleClick(Stockholm).dragAndDrop(Stockholm, Sweden).perform();
		System.out.println("Matched the pairs");
		act.doubleClick(Stockholm).dragAndDrop(Stockholm, capitals).perform();
		Thread.sleep(2000);
		
//		act.moveToElement(driver.findElement(By.xpath("//div[@id='header']//img"))).doubleClick().perform();
//		System.out.println("back to homepage");
	}

}
