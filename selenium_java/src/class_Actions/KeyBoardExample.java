package class_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://text-compare.com/");
		driver.findElement(By.xpath("//textarea[@name='text1']")).sendKeys("HI ALL , WELCOME TO CLASS");
	
		Actions act = new Actions(driver);
		//ctrl A// keys - class // to press the keys + key down and to release the key = keyup
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@name='text2']")).click();
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		driver.quit();
	}
	
}
