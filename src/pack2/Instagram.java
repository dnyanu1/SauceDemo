package pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Instagram
    {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		System.out.println("Browser opened successfully");
		driver.manage().window().maximize();//chaining method
		System.out.println("window maximized");
		driver.get("https://www.instagram.com");
		System.out.println("Url opened successfully");
		Thread.sleep(3000);
		//username
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("dny428");
		System.out.println("Username entered successfully");
        Thread.sleep(2000);
		//password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("963");
		System.out.println("Password entered successfully");
		Thread.sleep(3000);
		//unmask 
		driver.findElement(By.xpath("//button[@type='button']")).click();
		System.out.println("Unmasked the password");
		Thread.sleep(2000);
		//mask 
		driver.findElement(By.xpath("//button[@type='button']")).click();
		System.out.println("Masked the password");
		Thread.sleep(2000);
		// log in
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Logged in successfully");
		Thread.sleep(4000);
//		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//div[@class='q9xVd']")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("(//img[contains(@alt,'dnyanu7428')])")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//div[text()='Profile']")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//a[text()='Edit Profile']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("pepName")).clear();
//		Thread.sleep(3000);
//		driver.findElement(By.id("pepName")).sendKeys("dnyaneshwar");
//		Thread.sleep(2000);
//		driver.findElement(By.id("pepWebsite")).sendKeys("https://www.toolsqa.com");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='Submit']")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//div[@class='XrOey']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//a[text()='khloekardashian']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("(//div[@class='eXle2'])[7]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='QBdPU ']")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//button[text()='Block this user']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[text()='Block']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='Dismiss']")).click();
//		driver.findElement(By.xpath("(//img[contains(@alt,'dnyanu7428')])")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//div[text()='Log Out']")).click();
	}
}

