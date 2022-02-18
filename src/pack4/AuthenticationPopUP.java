package pack4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class AuthenticationPopUP {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe"); 
		WebDriver driver= new EdgeDriver();
		System.out.println("Browser opened successfully");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		String username="admin";
		String password="admin";
		String url="the-internet.herokuapp.com/basic_auth";
	    String mainURL="https://"+username+":"+password+"@"+url ;
		
	    driver.get(mainURL);
	    
//	   https://username:password@the-internet.herokuapp.com/basic_auth
	    
	    
//		driver.navigate().to("https://"+username+":"+password+"@"+url);
	    
	    File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File target= new File("C:\\screenshot\\Authentication.jpg");
	    FileHandler.copy(source, target);
	    
	    System.out.println("cleared the authentication and screenshot saved");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
		
		
		
//		https://the-internet.herokuapp.com/basic_auth

	}

}
