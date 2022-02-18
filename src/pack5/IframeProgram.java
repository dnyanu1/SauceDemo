package pack5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeProgram {

	public static void main(String[] args) 
	{
     System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
	 WebDriver driver= new EdgeDriver();
     System.out.println("Browser opened successfully");
		   
     driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.get("https://chercher.tech/practice/frames");
		
	WebElement frame2=driver.findElement(By.xpath("//iframe[@id='frame2']"));
		
		driver.switchTo().frame(frame2);
		
	WebElement animals=driver.findElement(By.xpath("//select[@id='animals']"));
	animals.click();
	Select dropdown= new Select(animals);
	dropdown.selectByValue("big baby cat");
	System.out.println("big baby cat Selected");
	animals.click();
		
//	driver.switchTo().defaultContent();
	driver.switchTo().frame(0);
	
	WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame1']"));
	 
	driver.switchTo().frame(frame1);
	driver.findElement(By.xpath("//b[@id='topic']"));
	
	WebElement frame3=driver.findElement(By.xpath("//iframe[@id='frame3']"));
	driver.switchTo().frame(frame3);
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	System.out.println("Marked the check box");
		
//	driver.switchTo().parentFrame();
//	System.out.println("Switched to parent frame of frame3 i.e frame2");
//	driver.switchTo().parentFrame();
//	System.out.println("Switched to parent frame of frame2 i.e main frame or defaultframe");
	
//	driver.switchTo().defaultContent();
//	System.out.println("Switched to the main frame or defaultframe directly");
//	driver.findElement(By.xpath("//a[text()='Java Selenium']")).click();
//	
		

	}

}
