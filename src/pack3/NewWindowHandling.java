package pack3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NewWindowHandling 
    {
     public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
	WebDriver driver= new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.w3schools.com/sql/sql_select.asp");
	
    driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself »')])[1]")).click();
    
    driver.findElement(By.xpath("(//a[contains(text(),'Try it Yourself »')])[2]")).click();
    
    driver.findElement(By.xpath("(//a[contains(@title,'Get Your Own Website')])[1]")).click();

    
    List<String> allPagesAddresses= new ArrayList<String>(driver.getWindowHandles());
    
    System.out.println(allPagesAddresses);
    driver.switchTo().window(allPagesAddresses.get(1));
    driver.findElement(By.xpath("//a[contains(@title,'Get your')]")).click();
//    driver.findElement(By.xpath("//a[text()='w3schools.com']")).click();
    driver.switchTo().window(allPagesAddresses.get(0));
    driver.findElement(By.xpath("(//a[contains(@title,'Get Your Own Website')])[1]")).click();
    driver.switchTo().window(allPagesAddresses.get(2));
    driver.findElement(By.xpath("//a[text()='w3schools.com']")).click();
    System.out.println("End of the program");
	}

}
