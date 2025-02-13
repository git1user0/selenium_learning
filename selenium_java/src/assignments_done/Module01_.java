package assignments_done;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module01_ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); //WebDriver is the interface
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.findElement(By.xpath("//*[@id=\"vfb-7-1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-6-1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-6-2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[8]/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("country")).sendKeys("KUWAIT");
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.quit();

	}
	

}
