package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\TestLeaf\\drivers\\Chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html"); 
		Thread.sleep(2000);
		driver.findElementById("home").click();
		WebElement pos=driver.findElementByClassName("wp-categories-title");
		org.openqa.selenium.Point point=pos.getLocation();
		System.out.println(point);
		int x=point.getX();
		int y=point.getY();
		System.out.println("position of button is "+ x +" "+"and "+y);
		driver.close();
		Thread.sleep(2000);
	
		
	
		 
	}

}
