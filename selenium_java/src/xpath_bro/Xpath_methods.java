package xpath_bro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_methods {
        // 03/02/2025
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		/*Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@id,'ema')]")).sendKeys("nksdldhfjdsk");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();*/
		driver.findElement(By.xpath("//input[@id='email'and @name='email']")).sendKeys("nksdldhfjdsk");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='pass' or @name='pass']")).sendKeys("nksdldhfjdsk");
		Thread.sleep(1000);
        System.out.println("Successfully done");
        driver.quit();
	}

}
