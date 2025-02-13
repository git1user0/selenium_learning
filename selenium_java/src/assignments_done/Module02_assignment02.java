package assignments_done;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module02_assignment02 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WebDriver driver = new ChromeDriver(); // WebDriver is the interface
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        System.out.print("Enter Customer ID: ");
        String key = sc.nextLine();
        
        driver.findElement(By.name("cusid")).sendKeys(key);
        driver.findElement(By.name("submit")).click();

        driver.switchTo().alert().accept();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().alert().accept();
        System.out.println("successfully deleted");

        driver.quit();
    }


}
