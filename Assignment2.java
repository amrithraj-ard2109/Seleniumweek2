package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\TestLeaf\\drivers\\Chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html"); 
		Thread.sleep(2000);
		
		driver.findElementById("email").sendKeys("amrithraj.ard@gmail.com");
		driver.findElementByXPath("(//input)[2]").sendKeys("raj",Keys.TAB);
		String s1=driver.findElementByXPath("//label[text()='Get default text entered']//following-sibling::input").getAttribute("value");	
		System.out.println("text entered is"+" "+s1);
		driver.findElementByXPath("//label[text()='Clear the text']//following-sibling::input").clear();
		Boolean b=driver.findElementByXPath("(//input)[2]").isDisplayed();
		System.out.println("is field disabled"+" "+b);
		

		
	}
}
