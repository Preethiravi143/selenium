package exercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver", "/opt/google/chrome/chrome.");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/java/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		System.out.println(driver.findElement(By.className("w3-left w3-bt")).getText());

	}

}
