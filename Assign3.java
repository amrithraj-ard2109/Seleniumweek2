package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3 {

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
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String number=driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println("First Resulting lead Id is "+" "+number);	
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//a[text()='Delete']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(number);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("No records to display"))
		{
		    System.out.println("Lead is deleted");
		}

		else
		{
		    System.out.println("Lead is not deleted");
		}
		
		
	}

}
