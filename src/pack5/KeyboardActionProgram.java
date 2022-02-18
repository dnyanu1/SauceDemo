package pack5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionProgram {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
    WebDriver driver= new EdgeDriver();
	System.out.println("Browser opened successfully");
			   
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://the-internet.herokuapp.com/key_presses");

		Actions act= new Actions(driver);
		
		act.sendKeys("Z").perform();
		
		
		
		
//		//p[@id='result']
//		//input[@id='target']
//		https://the-internet.herokuapp.com/key_presses
	}

}
