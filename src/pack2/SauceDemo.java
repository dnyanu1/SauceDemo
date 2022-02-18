package pack2;

import java.io.File;  //java class, we use to save screenshot
import java.io.FileInputStream;   // java method to open excel file
import java.io.IOException;  
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;//apache class read to excel sheet

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;   //selenium method to copy file from source to target
import org.openqa.selenium.support.ui.Select;


public class SauceDemo 
    {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	System.setProperty("webdriver.gecko.driver","C:\\gecko\\geckodriver.exe");//select+shift+right click for copy as path
	WebDriver driver = new FirefoxDriver();
	System.out.println("Browser opened successfully");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	System.out.println("Window Maximized successfully");
//	Thread.sleep(2000);
	
	
	
	driver.get("https://www.saucedemo.com");
	System.out.println("Url opened successfully");
	
	// timestamp
//		Date d = new Date();
//	    SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYYY_HHmmss");
//	   String timestamp = sdf.format(d);
//	String timestamp = new SimpleDateFormat("dd/MM/YYYY_HH:mm:ss").format(new Date());
//	   
//	 //screenshot
//	   File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	   FileHandler.copy(src, new File("C:\\screenshot\\Loginpage"+timestamp+".jpg"));
	   
	System.out.println("url : "+driver.getCurrentUrl());
	String ExpectedUrl="https://www.saucedemo.com";
	
//  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //waits

	String ActualUrl=driver.getCurrentUrl();
	if(ExpectedUrl.contentEquals(ActualUrl))
	{
		 System.out.println("Correct Url");
	}
	else
	{
		System.out.println("wrong Url");
	}
	System.out.println("Title :" + driver.getTitle());
//	Thread.sleep(2000);
	String path="C:\\Users\\yashv\\Desktop\\Book1.xlsx";
	
	//fetching data from excel sheet
	
	FileInputStream file =new FileInputStream(path);
	XSSFWorkbook workbook= new XSSFWorkbook(file);   //workbook class of apache
	
	String Username=workbook.getSheet("Sheet1").getRow(9).getCell(0).getStringCellValue();
	
	String Password=workbook.getSheet("Sheet1").getRow(9).getCell(1).getStringCellValue();
	
	System.out.println("Username :"+Username);
	System.out.println("Password :"+Password);
	
     driver.findElement(By.xpath("//div[1][@class='form_group']//input")).sendKeys(Username);
     System.out.println("Username Entered successfully");
//     Thread.sleep(2000);
     
 driver.findElement(By.xpath("//div[2][@class='form_group']//input")).sendKeys(Password);
     System.out.println("Password Entered successfully");
//     Thread.sleep(3000);
//      
     driver.findElement(By.id("login-button")).click();
     System.out.println("Logged in successfully");
//     File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//     FileHandler.copy(src1, new File("C:\\screenshot\\Homepage"+timestamp+".jpg"));
    
 List<WebElement> elements=new ArrayList<WebElement>(driver.findElements(By.xpath("//div//button[text()='Add to cart']")));
//     for(int i=0; i<elements.size(); i++)
//     { 
//    	 elements.get(i).click();
//     }
//     System.out.println("Added to cart successfully");
     
 for (WebElement carts : elements) 
 {
	 carts.click();
 }
     
 System.out.println(elements.size()+" products have been Added to cart successfully");
     
//     for(int i=0; i<elements.size(); i++)
//     {
////    	try {
//    	 elements.get(i).click();
////    	 System.out.println(elements.get(i));
//    	 driver.navigate().back();
//    	 driver.navigate().refresh();
//    	 } 
//    	catch (StaleElementReferenceException e) {
//            // If the exception occurs, find the elements again and click on it
//    		elements= driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
//    		elements.get(i).click();
//        }
//     }
//     
//     Thread.sleep(3000);
//        
//     WebElement DropdownSearch=driver.findElement(By.xpath("//select[@class='product_sort_container']"));
//     DropdownSearch.click();
//     Thread.sleep(2000);
//     Select S= new Select(DropdownSearch);// creation of object of select class 
////                         and passing the dropdown webElement as parameter to its constructor.
////     S.selectByIndex(2);
////       S.selectByValue("lohi");
//       S.selectByVisibleText("Price (low to high)");
//       System.out.println("Low to High Price Selected");
//     
//     List<WebElement> sortlist= S.getOptions();
//    int options= S.getOptions().size();
//       System.out.println("Number of options to sort the products are "+options);
//  
//       System.out.println("Those options are");
//       
//    for(int i=0; i<options; i++)
//  {
//	 sortlist.get(i).getText(); 
//	 System.out.println(sortlist.get(i).getText());
//  }
    
//    for(WebElement option : sortlist  )
//    {
//    	System.out.println(option.getText());
//    }
     
//     File src2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//     FileHandler.copy(src2, new File("C:\\screenshot\\dropdown"+timestamp+".jpg"));
//     Thread.sleep(3000);
     
//        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
//        System.out.println("Added to Cart Succesfully");
//        File src3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileHandler.copy(src3, new File("C:\\screenshot\\AddToCart"+timestamp+".jpg"));
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
//        System.out.println("Opened the Cart Succesfully");
//        File src4=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileHandler.copy(src4, new File("C:\\screenshot\\CartOpened"+timestamp+".jpg"));
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[text()='Checkout']")).click();
//        System.out.println("clicked on check out");
//        File src5=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileHandler.copy(src5, new File("C:\\screenshot\\Checkout"+timestamp+".jpg"));
//    	Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Akhilesh");
//        System.out.println("First name Entered successfully");
//    	Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Yadav");
//        System.out.println("Last name Entered successfully");
//    	Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("443001");
//        System.out.println("Postal-code Entered successfully");
//        File src6=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileHandler.copy(src6, new File("C:\\screenshot\\BacktoHomepage"+timestamp+".jpg")); 
//    	Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@name='continue']")).click();
//        System.out.println("Clicked on continue");
//        File src7=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileHandler.copy(src7, new File("C:\\screenshot\\SignUp"+timestamp+".jpg"));
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[text()='Finish']")).click();
//        System.out.println("Clicked on Finish");
//        File src8=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileHandler.copy(src8, new File("C:\\screenshot\\Finished"+timestamp+".jpg"));
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[text()='Back Home']")).click();
//        System.out.println("Went to homepage");
//        File src9=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileHandler.copy(src9, new File("C:\\screenshot\\BacktoHomepage"+timestamp+".jpg")); 
	}

}

