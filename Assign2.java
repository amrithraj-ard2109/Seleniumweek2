package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\TestLeaf\\drivers\\Chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main"); 
		Thread.sleep(2000);
		//org.openqa.selenium.WebDriver.Options manage=driver.manage();
		//org.openqa.selenium.WebDriver.Window window=manage.window();
		driver.manage().window().maximize();
		WebElement username=driver.findElementById("username");
		username.sendKeys("demosalesmanager");
		WebElement password=driver.findElementById("password");
		password.sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByPartialLinkText("Leads").click();

	}

}
