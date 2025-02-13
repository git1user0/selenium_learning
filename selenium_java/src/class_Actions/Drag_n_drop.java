package class_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_n_drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(5000);
		WebElement de = driver.findElement(By.id("box3"));
		WebElement da = driver.findElement(By.id("box103"));
		Actions act = new Actions(driver);
		act.dragAndDrop(de, da).build().perform();
		Thread.sleep(5000);
		driver.quit();

	}

}
