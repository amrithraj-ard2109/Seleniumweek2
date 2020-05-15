package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgn2 {

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
		driver.findElementByXPath("//input[@name='firstName' and @id='ext-gen248']").sendKeys("Amrith");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		//verify title
		String title=driver.findElementByXPath("//div[text()='View Lead']").getText();
		System.out.println(title);
		String verify="View Lead";
		if(verify.equals(title))
		{
			System.out.println("Title of the Page is True");
		}
		else
		{
			System.out.println("Title of the page is false");
		}
		driver.findElementByXPath("//a[text()='Edit']").click();
		System.out.println("Clicked on edit");
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("new company");
		driver.findElementByXPath("//input[@name='submitButton' and @class='smallSubmit' and @value='Update']").click();
		String changed=driver.findElementById("viewLead_companyName_sp").getText();
		String change="new company";
		if(changed.contains(change))
		{
			System.out.println("company name matches");
		}
		else
		{
			System.out.println("company name donesn't matches");
		}
		driver.close();
	}
	

}
