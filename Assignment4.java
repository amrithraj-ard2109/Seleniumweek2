package week2.day1;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\TestLeaf\\drivers\\Chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html"); 
		Thread.sleep(2000);
		driver.findElementByLinkText("Go to Home Page");
		driver.get("http://www.leafground.com/pages/Button.html");
		Thread.sleep(3000);
		driver.get("http://www.leafground.com/pages/Link.html"); 
		driver.findElementByXPath("//a[@href='error.html']").click();
		driver.navigate().back();
		System.out.println("came back");
		java.util.List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links are "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			
			WebElement ele= links.get(i);
			
			String url=ele.getAttribute("href");
		}
		
		}

}
