package assignments_done;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Module02_assignment03 {
	 public static void main(String[] args) throws IOException {
	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver(); 
	        driver.manage().window().maximize();
	        driver.get("https://jqueryui.com/");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.findElement(By.linkText("Draggable")).click();
	        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));  
	        driver.findElement(By.id("draggable")).click();
	        WebElement block = driver.findElement(By.id("draggable"));
	        Actions actions = new Actions(driver);
	        actions.dragAndDropBy(block, 100, 50).perform();
	        File screenshot = driver.findElement(By.xpath("/html/body")).getScreenshotAs(OutputType.FILE);
			File destination = new File(System.getProperty("user.dir")+"\\DRAG_ME_AROUND.png"); 
	        Files.copy(screenshot, destination);
			System.out.println("Screenshot saved successfully!" + destination.getAbsolutePath());
	        /*screen shot is taken and is saved in the
	         *  user current directory which is mention below in console
	         */
	        driver.quit();

	 }     


}
