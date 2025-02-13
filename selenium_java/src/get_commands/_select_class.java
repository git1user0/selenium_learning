package get_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _select_class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(2000);
		WebElement d = driver.findElement(By.id("day"));
		Select se = new Select(d);
		se.selectByIndex(13);
		
		WebElement d2 = driver.findElement(By.id("month"));
		Select s = new Select(d2);
		s.selectByVisibleText("Sep");
		Thread.sleep(2000);
		s.selectByIndex(11);
		
		WebElement d1 = driver.findElement(By.id("year"));
		Select e = new Select(d1);
		e.selectByValue("2018");
		
		System.out.println("clicked");
		
		driver.quit();

	}

}
