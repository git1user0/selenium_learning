package assignments_done;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module02_assignment01_ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver(); //WebDriver is the interface
				driver.manage().window().maximize();
				driver.get("https://demo.guru99.com/test/web-table-element.php");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				List<WebElement> names_list = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
				for(int i = 1 ; i < names_list.size();i++ ) {
					System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+ i +"]/td[1]")).getText());
				}
				driver.quit();
				
	}
}
