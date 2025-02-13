package class_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_hower {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(2000);
		WebElement d = driver.findElement(By.id("doubleClickBtn"));
		WebElement d1 = driver.findElement(By.id("rightClickBtn"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.doubleClick(d).build().perform();
		act.contextClick(d1).build().perform();
		
		driver.quit();

	}

}
