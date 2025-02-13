package class_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _google_ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//textarea)[1]")).sendKeys("excelr");
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		act.keyDown(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		act.keyDown(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		driver.quit();
		

	}

}
