package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\TestLeaf\\drivers\\Chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html"); 
		Thread.sleep(2000);
		
		WebElement sel=driver.findElementByXPath("//select[@id='dropdown1']");
		Select sel1=new Select(sel);
		sel1.selectByIndex(1);
		
		WebElement sel11=driver.findElementByXPath("//select[@name='dropdown2']");
		Select sel12=new Select(sel11);
		sel12.selectByVisibleText("Selenium");
		
		WebElement sel112=driver.findElementByXPath("//select[@name='dropdown3']");
		Select sel122=new Select(sel112);
		sel122.selectByValue("1");
	
	}

}
