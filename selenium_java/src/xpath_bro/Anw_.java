package xpath_bro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Anw_ {
	public static void main(String[] args) {
		// div[id='SIvCob'] a  a is added because to target only the a tags
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		List<WebElement> names = driver.findElements(By.cssSelector("div[id='SIvCob'] a"));
		for(int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i).getText()+" ");
		}
		for(WebElement web : names) {
			System.out.println(web.getText());
		}
		driver.quit();
	}
}
