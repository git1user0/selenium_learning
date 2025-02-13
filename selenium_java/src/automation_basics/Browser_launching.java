package automation_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launching {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); //WebDriver is the interface
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		/*driver.findElement(By.id("email")).sendKeys("bharath31m45@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("bharath31m45@gmail.com");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();*/
		driver.findElement(By.className("_6ltg")).click();
		Thread.sleep(3000);
		driver.close();
		System.out.println("successfully done");
	}

}
