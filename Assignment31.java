package week2.day1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment31 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\TestLeaf\\drivers\\Chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html"); 
		Thread.sleep(2000);
		driver.get("http://www.leafground.com/pages/Button.html"); 
		String clr=driver.findElementByXPath("//button[@id='color']").getCssValue("background-color");
		System.out.println(clr);
		
		Dimension q=driver.findElementByXPath("//button[@id='size']").getSize();
		System.out.println(q);
	}

}
