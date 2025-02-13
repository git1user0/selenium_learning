package automation_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_syntax {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		/*driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("mobile"); //tagname#id_value
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("mobile");
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("mobile");*/
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("mobile");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
