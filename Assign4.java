package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign4 {

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
		//CRM/SFA
		WebElement password=driver.findElementById("password");
		password.sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByPartialLinkText("Leads").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("babu");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String name=driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").getText();
		System.out.println(name);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		String title=driver.findElementByXPath("//div[text()='Duplicate Lead']").getText();
		System.out.println(title);
		String nameDup=driver.findElementById("createLeadForm_firstName").getText();
		System.out.println(nameDup);
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		if(name.equals(nameDup))
		{
			System.out.println("Duplicated name is same as actual name");
		}
		else
		{
			System.out.println("Duplicated name is not as same as actual name");
		}
		driver.close();
		
	}

}
