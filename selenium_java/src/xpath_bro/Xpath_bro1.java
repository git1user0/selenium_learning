package xpath_bro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_bro1 { // relative xpaths
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("mobile");
		driver.findElement(By.xpath("//button[starts-with(@class,'btn btn')]")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
