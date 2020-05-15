package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver", "D:\\TestLeaf\\drivers\\Geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		
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
		driver.findElementByPartialLinkText("Create").click();
		
		//driver.findElementById("createLeadForm_dataSourceId").sendKeys("Cold Call");
		Thread.sleep(2000);
		WebElement source1=driver.findElementById("createLeadForm_dataSourceId");
		Select sel=new Select(source1);
		sel.selectByVisibleText("Employee");
		
		WebElement source2=driver.findElementById("createLeadForm_marketingCampaignId");
		Select sel2=new Select(source2);
		sel2.selectByValue("9001");
		
		WebElement source3=driver.findElementById("createLeadForm_ownershipEnumId");
		Select sel11=new Select(source3);
		sel11.selectByIndex(5);
		
		WebElement source4=driver.findElementById("createLeadForm_generalCountryGeoId");
		Select sel3=new Select(source4);
		sel3.selectByVisibleText("India");
		
		driver.findElementByPartialLinkText("Create").click();
		
		System.out.println(driver.getTitle());
		
}
	
}
