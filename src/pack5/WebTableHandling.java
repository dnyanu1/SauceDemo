package pack5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTableHandling 
     {
	public static void main(String[] args) 
	{
    System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
    WebDriver driver= new EdgeDriver();
    System.out.println("Browser opened successfully");
		   
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.get("https://vctcpune.com");
    driver.findElement(By.xpath("//a[text()='Click to Start Selenium Practice Now']")).click();
    driver.getWindowHandles();
    List<String> addresses= new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(addresses.get(1));
    
    List<WebElement> columns=new ArrayList<WebElement>(driver.findElements(By.xpath("//table//tbody//tr//th")));
    
    List<WebElement> rows= new ArrayList<WebElement>(driver.findElements(By.xpath("//table//tbody//tr")));

    
//    for(int i=0; i<rows.size(); i++)
//    {
//  
//    List<WebElement> cell=rows.get(i).findElements(By.xpath("//table//tbody//tr"));
//
//    	for(int j=0; j<cell.size(); j++)	
//    	{
//    	System.out.println(cell.get(j).getText());
//        }
////    	break;
//     }
//    
    

//    for(int i=0; i<rows.size(); i++)
//      {
//    System.out.println(rows.get(i).getText());
//       }
    
//  List<WebElement> cells=new ArrayList<WebElement>(driver.findElements(By.xpath("//table//tbody//tr//td")));   
//    System.out.println(cells.size());
//    for(int j=0; j<cells.size(); j++)
//    {
//  System.out.println(cells.get(j).getText());
//     }  
    
    }
  }
