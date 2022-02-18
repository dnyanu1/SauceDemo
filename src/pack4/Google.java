package pack4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Google {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("(//div[@class='vcVZ7d']//div//a)[5]")).click(); //relative xpath
		driver.findElement(By.xpath("(//input[@class='RNmpXc'])[2]")).click(); 
		
		driver.findElement(By.id("searchinput")).sendKeys("Indian Republic day");
		driver.findElement(By.id("searchbtn")).click();
		driver.findElement(By.xpath("(//a[text()='India Republic Day 2022'])[2]")).click();
		Thread.sleep(4000);
		
		 for(int i=0; i<5; i++)
	        {
			driver.findElement(By.xpath("//a[@id='doodle-older']")).click();
			Thread.sleep(4000);
	        }
		 
        for(int i=0; i<5; i++)
        {
		driver.findElement(By.xpath("//a[@title='Next doodle']")).click();
		Thread.sleep(4000);
        }
		
//		WebElement Language=driver.findElement(By.xpath("//select[@id='lang-chooser']"));
//		Language.click();
//		Select dropdown= new Select(Language);
//		dropdown.selectByValue("hi");
//		dropdown.selectByIndex(4);
	
	}

}
