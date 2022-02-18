package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class4 {

	public static void main(String[] args) throws InterruptedException {
	
 System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver.exe");
  WebDriver driver=new FirefoxDriver();
  driver.get("https://opensource-demo.orangehrmlive.com");
  driver.manage().window().maximize();
  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
  Thread.sleep(2000);
//  driver.findElement(By.linkText("Forgot your password?")).click();
    driver.findElement(By.name("txtPassword")).sendKeys("admin123");
  driver.findElement(By.name("Submit")).click();
  Thread.sleep(2000);
//  driver.findElement(By.className("quickLinkText")).click();
//  Thread.sleep(1000);
//  driver.findElement(By.id("assignleave_txtLeaveType")).click();
  driver.findElement(By.id("menu_pim_viewMyDetails")).click();
  Thread.sleep(1000);
  driver.findElement(By.id("btnSave")).click();
  Thread.sleep(1000);
  driver.findElement(By.name("personal[txtEmpFirstName]")).clear();
  Thread.sleep(1000);
  driver.findElement(By.name("personal[txtEmpFirstName]")).sendKeys("Selenium");
  Thread.sleep(1000);
  driver.findElement(By.id("personal_txtEmpMiddleName")).clear();
  Thread.sleep(1000);
  driver.findElement(By.id("personal_txtEmpMiddleName")).sendKeys("with");
  Thread.sleep(1000);
  driver.findElement(By.name("personal[txtEmpLastName]")).clear();
  Thread.sleep(1000);
  driver.findElement(By.name("personal[txtEmpLastName]")).sendKeys("Java");
  driver.findElement(By.id("btnSave")).click();
  
	}
}
