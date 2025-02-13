package class_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders_ {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		Thread.sleep(2000);
		
		WebElement min_button = driver.findElement(By.xpath("(//span[@tabindex='0'])[1]"));
		System.out.println("before"+min_button.getLocation());
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDropBy(min_button, 200, 0).build().perform();
		Thread.sleep(2000);
		System.out.println("After"+min_button.getLocation());
		
		WebElement max_button = driver.findElement(By.xpath("(//span[@tabindex='0'])[2]"));
		System.out.println("before"+max_button.getLocation());
		Thread.sleep(2000);
		act.dragAndDropBy(max_button, -100, 0).build().perform();
		Thread.sleep(2000);
		System.out.println("After"+max_button.getLocation());
		driver.quit();

	}

}
