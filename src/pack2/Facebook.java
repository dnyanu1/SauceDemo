package pack2;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException, IOException {
//	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
//	WebDriver driver= new ChromeDriver();//ctrl+shift+O
	System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
	WebDriver driver= new EdgeDriver();
	Thread.sleep(2000);
	System.out.println("Browser opened successfully");
	driver.get("https://www.facebook.com");
	
	
	//timestamp
	Date d = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYYY_HHmmss");
   String timestamp = sdf.format(d);

   //screenshot
  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  FileHandler.copy(src, new File("C:\\screenshot\\Loginpage"+timestamp+".jpg"));

	System.out.println("Url opened successfully");
	Thread.sleep(2000);
	  
	//screenshot
//	TakesScreenshot ts=(TakesScreenshot)driver;
//	File source=ts.getScreenshotAs(OutputType.FILE);
//	File dest=new File("C:\\selenium\\screenshot\\LoginPage.jpg");
//	FileHandler.copy(source,dest);
	
	
//	driver.manage().window().maximize();
//	System.out.println("Maximized window successfully");
//	Thread.sleep(2000);
//	WebElement CreateNewAccount=driver.findElement(By.xpath("//div[@class='_6ltg']//a"));
//	         CreateNewAccount.click();
//	         System.out.println("opened create new account page");
//	Thread.sleep(2000);
//	
//	WebElement FirstName=driver.findElement(By.xpath("//input[@placeholder='First name']"));
//	  boolean F=FirstName.isEnabled();
//	  if (F==true)
//	  {
//		  System.out.println("Firstname Textbox in enabled");
//	  }
//	  else
//	  {
//		  System.out.println("Textbox is not enabled");
//	  }
//	          FirstName.sendKeys("Pravin");
//	          System.out.println("First Name entered successfully");
//	          Thread.sleep(2000);
//	
//	WebElement Surname=driver.findElement(By.xpath("//input[@name='lastname']"));
//	boolean S=Surname.isEnabled();
//	 if (S==true)
//	  {
//		  System.out.println("surname Textbox in enabled");
//		
//	  }
//	  else
//	  {
//		  System.out.println("Textbox is not enabled");
//	  }
//			Surname.sendKeys("Kumar");
//			 System.out.println("Surname entered successfully");
//	        Thread.sleep(2000);
//	
//	WebElement PhoneOrEmail=driver.findElement(By.xpath("//input[@name='reg_email__']"));
//	PhoneOrEmail.sendKeys("pravinkumar@gmail.com");
//	 System.out.println("Phone or email entered successfully");
//	Thread.sleep(2000);
//	
//	WebElement Password=driver.findElement(By.xpath("(//input[@type='password'])[2]"));
//	         Password.sendKeys("Kumar123456");
//	         System.out.println("Password entered successfully");
//	         Thread.sleep(2000);
//	         
//	WebElement  birthday_day= driver.findElement(By.xpath("//select[@name='birthday_day']"));
//	          birthday_day.click();
//	   Select BD= new Select(birthday_day);       
//	          BD.selectByIndex(15);
//	          Thread.sleep(2000);
//	    
//   WebElement  birthday_month= driver.findElement(By.xpath("//select[@name='birthday_month']"));
//	   birthday_month.click();
//	  System.out.println("clicked");
//	Select BM= new Select(birthday_month);       
//	     BM.selectByVisibleText("Feb");
//	    Thread.sleep(2000);
//	          
//	WebElement  birthday_year= driver.findElement(By.xpath("//select[@name='birthday_year']"));
//	 birthday_year.click();
//	 Select BY= new Select(birthday_year);       
//	     BY.selectByValue("1995");
//	    Thread.sleep(2000);
//	    
//	 WebElement  Gender= driver.findElement(By.xpath("//label[text()='Custom']"));
//	      boolean Gen=Gender.isEnabled();
//	      if(Gen==true)
//	      {
//	    	  System.out.println("Radio button is enabled");
//	      }
//	      else
//	      {
//	    	  System.out.println("Radio button is not enabled");
//	      }
//	      Gender.click();
//	      Thread.sleep(2000);
//	      
//	      WebElement  preferred_pronoun= driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
//	      preferred_pronoun.click();
//		Select PN= new Select(preferred_pronoun);       
//		     PN.selectByIndex(2);
//		     
//		     driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();		    
    
    //    (//button[text()='Sign Up'])[1]
     //   //select[@name='preferred_pronoun']
    // gender custom  //label[text()='Custom']
    //by    //select[@name='birthday_year']
    // bm   //select[@name='birthday_month']
    //bday  //select[@name='birthday_day']
    //psd  (//input[@type='password'])[2]
    //email //div[@class='mbm _a4y']//input  or //input[@name='reg_email__']
    // Sn    //input[@name='lastname']
    //FN  //input[@placeholder='First name']
    //cna //div[@class='_6ltg']//a
	}

}
