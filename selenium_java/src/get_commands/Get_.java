package get_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());// web page name displayed on tab
		System.out.println(driver.getCurrentUrl()); // currently launched U r l
		System.out.println(driver.getWindowHandle()); //window id
		driver.close();     // closes only one browser
		driver.quit();         // close all the browser we are working with
		*/
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement ne = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(ne.isDisplayed());
		Thread.sleep(2000);
		WebElement n1 = driver.findElement(By.xpath("//input[@id='FirstName']"));
		Thread.sleep(2000);
		WebElement n2 = driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println(n1.isEnabled());
		WebElement f1 = driver.findElement(By.xpath("//input[@id='gender-female']"));
		f1.click();
		System.out.println(f1.isSelected());
		System.out.println("clicked");
		driver.quit();
	}

}
