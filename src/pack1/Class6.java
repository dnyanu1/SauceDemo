package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Class6 {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
	WebDriver driver= new EdgeDriver();
  driver.get("https://www.instagram.com");
	}

}
