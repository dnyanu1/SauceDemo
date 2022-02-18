package pack2;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot; 
import org.openqa.selenium.WebDriver;       
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;  


public class Screenshot
{
    public static void main(String[] args) throws IOException {
     System.setProperty("webdriver.edge.driver","C:\\edgedriver\\msedgedriver.exe");
 	WebDriver driver= new EdgeDriver();
// 	WebDriver driver1=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
//		TakesScreenshot ts=(TakesScreenshot)driver;    //interface
//		File src=ts.getScreenshotAs(OutputType.FILE);   //method of that interface// source 
//		File trg=new File("C:\\screenshot\\Loginpage.png");  // target where we want to save it.
//		FileHandler.copy(src, trg);  //
		
		Date d = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYYY_HHmmss");
	   String timestamp = sdf.format(d);
	
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("C:\\screenshot\\Loginpage"+timestamp+".jpg"));
	
    }

}
